package com.nit.service;

import java.util.List;

import com.nit.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
    
	public  EmployeeDTO fetchEmployeeByNo(int eno);
	public List<EmployeeDTO> fetchEmployeeBydesg(String desg1,String desg2,String desg3);
}
