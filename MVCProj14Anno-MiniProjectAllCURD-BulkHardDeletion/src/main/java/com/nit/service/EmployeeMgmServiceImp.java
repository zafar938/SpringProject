package com.nit.service;

import java.util.Arrays;
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
	public String fireEmployeeByNO(int enos[]) {
		StringBuffer cond=new StringBuffer();
		for(int i=0;i<enos.length;++i) {
			if(i==0)
				cond.append("("+enos[i]+",");
			else if(i==enos.length-1)
				cond.append(enos[i]+")");
			else if(enos.length==1) 
				cond.append(")");
			else
				cond.append(enos[i]+",");
		}
	    System.out.println("Condition Data ::"+cond);
		int count=dao.deleteEmployeeByNo(cond.toString());
		return count==0?"Record Not Found":Arrays.toString(enos)+"-->Employee Record Found and Deleted";
	}

}
