package com.nit.service;

import java.util.List;

import com.nit.model.Emplyee;

public interface EmployeeMgmService {
	
	public List<Emplyee> fetchAllEmployeeDetails();
	public Emplyee fetchEmployeeDetailsById(int eno);
	public String modifyEmplolyeeDetailByEno(Emplyee emp);
	public String fireEmployeeByNO(int eno);

}
