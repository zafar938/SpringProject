package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
    @Autowired
	private IEmployeeRepo empRepo;
    
    
	@Override
	public Page<Employee> getPageData(Pageable pageable) {
		//use repo
		Page<Employee> page=empRepo.findAll(pageable);
		return page;
	}

}
