package com.nit;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nit.beans.WishMessageGenerator;

@SpringBootApplication
public class IocProj64BootBasicAppApplication {
	
     @Bean(name="dt")
     public LocalDateTime createLocalDateTime() {
		return LocalDateTime.now();
    	 
     }
	public static void main(String[] args) {
		
		//get IOC container
		ApplicationContext cxt=SpringApplication.run(IocProj64BootBasicAppApplication.class, args);
	    //get Target class obj
		WishMessageGenerator generator=cxt.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.generateWishMessage("zafar"));
		((ConfigurableApplicationContext) cxt).close();
	}

}
