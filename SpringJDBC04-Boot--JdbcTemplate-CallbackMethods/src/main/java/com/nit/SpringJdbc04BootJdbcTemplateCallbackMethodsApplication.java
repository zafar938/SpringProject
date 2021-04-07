package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.dto.EmployeeDTO;
import com.nit.service.IEmployeeMgmtService;

@SpringBootApplication
public class SpringJdbc04BootJdbcTemplateCallbackMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext cxt=SpringApplication.run(SpringJdbc04BootJdbcTemplateCallbackMethodsApplication.class, args);
		
		//get Service class obj
		IEmployeeMgmtService service=cxt.getBean("empService",IEmployeeMgmtService.class);
		//invoke method
		try {
			System.out.println("7689 Emp details are :: "+service.fetchEmployeeByNo(7689));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		System.out.println();
		System.out.println("==================================================");
		System.out.println();
		try {
			System.out.println("Employee details according to CLERK,MANAGER,SALESMAN DEGS");
			System.out.println();
			List<EmployeeDTO> listDTO=service.fetchEmployeeBydesg("CLERK","MANAGER","SALESMAN");
			listDTO.forEach(System.out::println);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
