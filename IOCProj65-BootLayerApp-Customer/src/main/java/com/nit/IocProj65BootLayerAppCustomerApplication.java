package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

@SpringBootApplication
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class IocProj65BootLayerAppCustomerApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext cxt=SpringApplication.run(IocProj65BootLayerAppCustomerApplication.class, args);
		try {
		//get target class object
		BankController controller=cxt.getBean("contrroller",BankController.class);
		
		//prepare VO class obj
		CustomerVO custVO=new CustomerVO("zafar","hyd","100000","2","4");
		//invoke the methods
		String result=controller.processCustomer(custVO);
		System.out.println("Interest Amount :: "+result);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) cxt).close();
	}

}
