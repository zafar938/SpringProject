package com.nit.dao;

import java.util.List;

import com.nit.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	public EmployeeBO getEmployeeByNo(int eno); 
	public List<EmployeeBO> getEmployeBydesg(String desg1,String desg2,String desg3);

}
