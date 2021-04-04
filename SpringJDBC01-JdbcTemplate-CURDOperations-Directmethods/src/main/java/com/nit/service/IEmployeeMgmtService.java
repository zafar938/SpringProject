package com.nit.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

public interface IEmployeeMgmtService {
	 public int fetchEmpsCount();
	 public float fetchEmployeeDetailsByEno(int eno);
	 public Map<String,Object> fetchEmployeeDetailByEno(int eno);
	 public List<Map<String,Object>> fetchEmployeeDetailsByDesg(String desg1,String desg2,String desg3);
	 public SqlRowSet fetchEmployeeDetailsBySalRange(float startSalary,float endSalary);
	 public String registerEmployee(String ename,String desg,float salary);
	 public String hikeEmployee(int eno,float percentage);
	 public String fireEmployeeBySalaryRange(float startSalary,float endSalary);
}
