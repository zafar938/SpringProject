package com.nit.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nit.service.IEmployeeMgmtService;

public class JdbcTemplateDirectMethodsTest {

	public static void main(String[] args) {
		//create  IOC Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/ApplicationContext.xml");
		
		IEmployeeMgmtService service=ctx.getBean("empService",IEmployeeMgmtService.class);
		/*
		 * try { System.out.println("EmpsCount "+service.fetchEmpsCount()); }
		 * catch(DataAccessException dae) { dae.printStackTrace(); }
		 * System.out.println("=================================================="); try
		 * {
		 * System.out.println("EmployeeSalary "+service.fetchEmployeeDetailsByEno(7788))
		 * ; } catch(DataAccessException dae) { dae.printStackTrace(); }
		 * System.out.println("=================================================="); try
		 * {
		 * //System.out.println("EmployeDetails "+service.fetchEmployeeDetailByEno(7788)
		 * ); Map<String,Object> map=service.fetchEmployeeDetailByEno(7788);
		 * map.entrySet().forEach(row->{
		 * System.out.println(row.getKey()+"     "+row.getValue()); }); }
		 * catch(DataAccessException dae) { dae.printStackTrace(); }
		 * System.out.println("==================================================");
		 * 
		 * 
		 * try { // System.out.println("CLERK Desg Emp Details are::"+service.
		 * fetchEmployeeDetailsByDesgs("CLERK","MANAGER","SALESMAN"));
		 * System.out.println("CLERK MANAGER SALESMAN Desg Emp Details are::");
		 * System.out.println();
		 * service.fetchEmployeeDetailsByDesg("CLERK","MANAGER","SALESMAN").forEach(map-
		 * >{ map.entrySet().forEach(row->{
		 * System.out.println(row.getKey()+"   "+row.getValue()); });
		 * System.out.println("\n"); }); } catch(DataAccessException dae) {
		 * dae.printStackTrace(); }
		 * System.out.println("=================================================="); try
		 * { System.out.println("2000 to 6000 salary range Emp Details are ::");
		 * System.out.println(); SqlRowSet
		 * rowSet=service.fetchEmployeeDetailsBySalRange(2000.0f, 6000.0f);
		 * while(rowSet.next()) {
		 * System.out.println(rowSet.getInt(1)+"     "+rowSet.getString(2)+"     "
		 * +rowSet.getString(3)+"     "+rowSet.getFloat(4)); }
		 * 
		 * } catch(DataAccessException dae) { dae.printStackTrace(); }
		 */

		System.out.println("==================================================");
		 try { 
			 System.out.println(service.registerEmployee("ZAFAR", "ENGG", 60000.0f));
			 }
		 catch(DataAccessException dae) {
			 dae.printStackTrace();
			 }
		 System.out.println("==================================================");
		 try { 
			 System.out.println(service.hikeEmployee(1, 20.0f));
		 }
		 catch(DataAccessException dae) {
			 dae.printStackTrace();
		 }
		 System.out.println("==================================================");
		 try { 
			 System.out.println(service.fireEmployeeBySalaryRange(7000.0f, 90000.0f));
		 }
		 catch(DataAccessException dae) {
			 dae.printStackTrace();
		 }
		((AbstractApplicationContext) ctx).close();
	}

}