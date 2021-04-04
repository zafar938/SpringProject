package com.nit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.bo.EmployeeBO;
import com.nit.dao.IEmployeeDAO;
import com.nit.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
    
	@Autowired
	private IEmployeeDAO dao;
	@Override
	public EmployeeDTO fetchEmployeeByNo(int eno) {
		//use dao
		EmployeeBO bo=dao.getEmployeeByNo(eno);
		//convert BO to DTO
		EmployeeDTO dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

}
