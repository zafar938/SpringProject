package com.nit.service;

import java.util.List;

import com.nit.dto.EmployeeDTO;

public interface IEmployeeService {
	
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1,String desg2,String desg3)throws Exception;

}
