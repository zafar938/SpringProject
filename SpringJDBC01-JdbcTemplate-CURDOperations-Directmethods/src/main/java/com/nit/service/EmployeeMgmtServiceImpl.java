package com.nit.service;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.nit.dao.IEmployeeDAO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private IEmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao = dao;
	}
	@Override
	public int fetchEmpsCount() {
		int count=dao.getEmployeesCount();
		return count;
	}
	@Override
	public float fetchEmployeeDetailsByEno(int eno) {
		float salary=dao.getEmployeeSalaryByEno(eno);
		return salary;
	}
	@Override
	public Map<String, Object> fetchEmployeeDetailByEno(int eno) {
		Map<String,Object> map=dao.getEmployeeDetailByEno(eno);
		return map;
	}
	@Override
	public List<Map<String, Object>> fetchEmployeeDetailsByDesg(String desg1, String desg2, String desg3) {
		List<Map<String,Object>> list=dao.getEmployeeDetailsByDegs(desg1, desg2, desg3);
		return list;
	}
	@Override
	public SqlRowSet fetchEmployeeDetailsBySalRange(float startSalary, float endSalary) {
		SqlRowSet rowSet=dao.getEmployeeDetailsBySalaryRange(startSalary, endSalary);
		return rowSet;
	}
	@Override
	public String registerEmployee(String ename, String desg, float salary) {
		//use dao
		int count=dao.insertEmployee(ename, desg, salary);
		return count==0?"Employee Not registered":"Employee is registered";
	}
	@Override
	public String hikeEmployee(int eno, float percentage) {
		//get current salary of employee
		float salary=fetchEmployeeDetailsByEno(eno);
		System.out.println("Employee initial Salary ::"+salary);
		//calculater new salary
		float newSalary=salary+(salary*percentage/100.0f);
		//use dao
		 int count=dao.updateEmployeeSalary(eno, newSalary);
		 return count==1?"Employee Salary updated with ::"+newSalary:"Employee salary not updated";
		
	}
	@Override
	public String fireEmployeeBySalaryRange(float startSalary, float endSalary) {
		int count=dao.deleteEmployeeSalaryRange(startSalary, endSalary);
		return count==1?"No employee found for deletion":count+"no.of employee are found are deleted";
	}

}
