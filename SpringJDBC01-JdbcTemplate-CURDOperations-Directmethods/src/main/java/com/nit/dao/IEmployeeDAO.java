package com.nit.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeDAO {
	public  int  getEmployeesCount();
	public float getEmployeeSalaryByEno(int eno);
	public Map<String,Object> getEmployeeDetailByEno(int eno);
	public List<Map<String,Object>> getEmployeeDetailsByDegs(String desg1,String desg2,String desg3);
    public SqlRowSet getEmployeeDetailsBySalaryRange(float startSalary,float endSalary);
    public int insertEmployee(String ename,String desg,float salary);
    public int updateEmployeeSalary(int eno,float newSalary);
    public int deleteEmployeeSalaryRange(float startSalary,float endSalary);
}
