package com.nit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.config.AppConfig;
import com.nit.dto.EmployeeDTO;
import com.nit.service.IEmployeeMgmtService;

public class CallbackMethodsTest {

	public static void main(String[] args) {
		//create ioc container
		ApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		
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
		System.out.println("==========================================================================================================");
		System.out.println();
		try {
			System.out.println("Employee details according to CLERK,MANAGER,SALESMAN DEGS");
			System.out.println();
			List<EmployeeDTO> listDTO=service.fetchEmployeeBydesg("CLERK", "MANAGER", "SALESMAN");
			listDTO.forEach(System.out::println);
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) cxt).close();

	}

}
