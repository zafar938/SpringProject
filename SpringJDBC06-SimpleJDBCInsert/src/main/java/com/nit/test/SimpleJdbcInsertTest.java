package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.model.ActorDetails;
import com.nit.service.IActorMgmService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		
		//create ioc conatiner
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/ApplicationContext.xml");
		
		IActorMgmService actor=cxt.getBean("actorService",IActorMgmService.class);
		
		try {
			ActorDetails details=new ActorDetails();
			 details.setActorid(4534);
			 details.setActorName("Poja Headge");
			 details.setActorAddress("Hydrabad");
			 details.setPhone(9984562387l);
			 details.setRemunration(345345256.7);
			 System.out.println(actor.addValue(details));
		}
        catch(DataAccessException dae) {
        	dae.printStackTrace();
        }
		((AbstractApplicationContext) cxt).close();
	}

}
