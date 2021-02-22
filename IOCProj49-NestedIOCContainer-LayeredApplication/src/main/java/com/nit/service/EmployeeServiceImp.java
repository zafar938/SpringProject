package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.bo.EmployeeBO;
import com.nit.dao.IEmployeeDAO;
import com.nit.dto.EmployeeDTO;

@Component("empService")
public class EmployeeServiceImp implements IEmployeeService {
    
	@Autowired
	private IEmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		//use dao
		 List<EmployeeBO> listBO=dao.getEmpsByDesgs(desg1, desg2, desg3);
		//convert listBO to listDTO
		List<EmployeeDTO> listDTO=new ArrayList();
				 listBO.forEach(bo->{
					 //copy each BO to Each DTO
					 EmployeeDTO dto=new EmployeeDTO();
					 BeanUtils.copyProperties(bo, dto);
					 dto.setSerialNo(listDTO.size()+1);
					 //add each DTO to ListDTO
					 listDTO.add(dto);
				 });
		return listDTO;
	}

}
