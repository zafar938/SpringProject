package com.nit.service;

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

}
