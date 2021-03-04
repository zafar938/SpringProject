package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.beans.WishMessageGenrator;
import com.nit.config.AppConfig;

public class InjectionTest {

	public static void main(String[] args) {
		//create ioc container
		ApplicationContext cxt=new AnnotationConfigApplicationContext(AppConfig.class);
		//create Spring beans obj
		//WishMessageGenrator genrator=cxt.getBean("wmg",WishMessageGenrator.class);
		//invoke b.method
		//System.out.println("Wish Message :: "+genrator.genrateWishMessage("  ZAFAR"));
		
		//close
		((AbstractApplicationContext) cxt).close();

	}

}
