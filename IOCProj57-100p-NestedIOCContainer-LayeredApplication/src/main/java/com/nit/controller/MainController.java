package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.nit.dto.EmployeeDTO;
import com.nit.service.IEmployeeService;

@Controller("controller")
@Lazy
public class MainController {
	
	@Autowired
	private IEmployeeService service;
	
	public List<EmployeeDTO> showEmpsByDesgs(String desg1,String desg2,String desg3) throws Exception{
		
		//user service class
		List<EmployeeDTO> listDTO=service.fetchEmpsByDesgs(desg1, desg2, desg3);
		return listDTO;
		
	}

}
