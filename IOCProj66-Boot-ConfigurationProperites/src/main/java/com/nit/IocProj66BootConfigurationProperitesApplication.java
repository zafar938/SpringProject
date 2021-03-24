package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.model.Person;

@SpringBootApplication
public class IocProj66BootConfigurationProperitesApplication {

	public static void main(String[] args) {
		ApplicationContext cxt=SpringApplication.run(IocProj66BootConfigurationProperitesApplication.class, args);
	  //get Bean
		Person per=cxt.getBean("pb",Person.class);
		System.out.println(per);
	}

}
