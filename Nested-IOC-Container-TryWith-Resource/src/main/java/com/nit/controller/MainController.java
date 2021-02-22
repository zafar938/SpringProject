package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMgmService;

@Controller("controller")
public class MainController {
	
     @Autowired
	private ICustomerMgmService service;
     
     public List<CustomerDTO> getCustomerDetailByBillAmt(float  cost)throws Exception{
    	 
    	 //call service method
    	 List<CustomerDTO> listDTO=service.fetchCustomerDetail(cost);
		return listDTO;
    	 
     }
}
