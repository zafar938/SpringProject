package com.nit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nit.model.ActorDetails;
import com.nit.service.IActorMgmService;

@SpringBootApplication
public class SpringJdbc07SimpleJdbcInserApplication {
	
	@Autowired
	private DataSource ds;
	
	@Bean(name="sji")
	public SimpleJdbcInsert createSJInsert() {
		return new SimpleJdbcInsert(ds);
		
	}

	public static void main(String[] args) {
		ApplicationContext cxt=SpringApplication.run(SpringJdbc07SimpleJdbcInserApplication.class, args);
	//get Bean
		IActorMgmService service=cxt.getBean("actorService",IActorMgmService.class);
		try {
			//invoke b.method
			System.out.println(service.addValue(new ActorDetails(2345,"Amir","bandra",8765514525l,98655127.8)));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		((AbstractApplicationContext) cxt).close();
	}

}
