package com.nit;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.model.Person;

@SpringBootApplication

public class IocProj67BootConfigurationProperites01YmlApplication {

	public static void main(String[] args) {
		
		SpringApplication application=new SpringApplication();
		application.setBannerMode(Mode.OFF);
		ApplicationContext cxt=SpringApplication.run(IocProj67BootConfigurationProperites01YmlApplication.class, args);
	    
		 //get bean
		Person per=cxt.getBean("pb",Person.class);
		System.out.println(per);
	}

}
