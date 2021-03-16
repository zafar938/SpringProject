package com.nit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nit.controller.BankController;
import com.nit.vo.CustomerVO;

@SpringBootApplication( exclude=DataSourceAutoConfiguration.class )
@ImportResource("com/nit/cfgs/applicationContext.xml")
public class IocProj65BootLayerAppCustomerApplication {
	
	/*
	 * @Autowired private Environment env;
	 * 
	 * @Bean(name="c3p0DS") public DataSource createC3PODS()throws Exception{
	 * ComboPooledDataSource ds=new ComboPooledDataSource();
	 * ds.setDriverClass(env.getRequiredProperty(
	 * "spring.datasource.driver-class-name"));
	 * ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
	 * ds.setUser(env.getRequiredProperty("spring.datasource.username"));
	 * ds.setPassword(env.getRequiredProperty("spring.datasource.password")); return
	 * ds;
	 * 
	 * }
	 */
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
