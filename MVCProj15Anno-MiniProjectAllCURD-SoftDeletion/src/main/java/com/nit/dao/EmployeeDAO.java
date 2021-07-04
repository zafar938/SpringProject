 package com.nit.dao;

import java.util.List;

import com.nit.model.Emplyee;

public interface EmployeeDAO {
	public List<Emplyee> getAllEmployeeDetails();
	public Emplyee getEmployeeDetailsById(int eno);
	public int UpdateEmployeeDetailsByEno(Emplyee emp);
	public int deleteEmployeeByNo(String cond);

}
