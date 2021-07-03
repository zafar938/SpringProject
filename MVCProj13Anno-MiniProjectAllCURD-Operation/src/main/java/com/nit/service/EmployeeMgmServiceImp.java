package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.dao.EmployeeDAO;
import com.nit.model.Emplyee;

@Service("empService")
public class EmployeeMgmServiceImp implements EmployeeMgmService {
    @Autowired
	private EmployeeDAO dao;
    
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public List<Emplyee> fetchAllEmployeeDetails() {
		List<Emplyee> listEmps=dao.getAllEmployeeDetails();
		return listEmps;
	}

	@Override
	public Emplyee fetchEmployeeDetailsById(int eno) {
		// use dao
		Emplyee emp=dao.getEmployeeDetailsById(eno);
		return emp;
	}

	@Override
	public String modifyEmplolyeeDetailByEno(Emplyee emp) {
	  int count=dao.UpdateEmployeeDetailsByEno(emp);	
		return count==1?"Record updated":"Record Not Found";
	}

	@Override
	public String fireEmployeeByNO(int eno) {
		//use dao
		int count=dao.deleteEmployeeByNo(eno);
		return count==0?"Record Not Found":eno+"--->id related Employee record deleted";
	}

}
