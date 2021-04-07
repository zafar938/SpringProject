package com.nit.service;

import java.util.ArrayList;
import java.util.List;

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
	@Override
	public List<EmployeeDTO> fetchEmployeeBydesg(String desg1, String desg2, String desg3) {
		//use dao
		List<EmployeeBO> listBO=dao.getEmployeBydesg(desg1, desg2, desg3);
		//convert listBO to listDTO
		List<EmployeeDTO> listDTO=new ArrayList();
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			//add to listDTO
			listDTO.add(dto);
		});
		
		return listDTO;
	}

}
