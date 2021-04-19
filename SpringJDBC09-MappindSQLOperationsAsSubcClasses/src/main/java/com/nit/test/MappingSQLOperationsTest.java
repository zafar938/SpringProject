package com.nit.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.model.PoliticalParty;
import com.nit.service.IPoliticalPartyMgmtService;

public class MappingSQLOperationsTest {

	public static void main(String[] args) {
		//create container
		ApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
      //get service class obj
		IPoliticalPartyMgmtService service=cxt.getBean("partyService",IPoliticalPartyMgmtService.class);
		
		try {
			PoliticalParty party=service.fetchPoliticalPartyDetailsByPartyId(174);
			if(party!=null)
				System.out.println("party Details are ::"+party);
			else 
				System.out.println("party not found");
		}
		catch(DataAccessException dae) {
		dae.printStackTrace();
		}
		System.out.println();
		System.out.println("===================================================================");
		System.out.println();
		try {
			List<PoliticalParty> list=service.fetchPoliticalPartyDetailsByPartyName("BJP","APP","INC");
			if(list!=null || list.size()>=1)
				list.forEach(System.out::println);
			else 
				System.out.println("party not found");
		}
		catch(DataAccessException dae) {
		dae.printStackTrace();
		}
		System.out.println();
		System.out.println("===================================================================");
		System.out.println();
		try {
			System.out.println(service.updatePartyFlagByName("WHITE-COLOR", "INC"));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		((AbstractApplicationContext) cxt).close();
	}//main

}//class
