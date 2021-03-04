package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMgmtService;
import com.nit.vo.CustomerVO;

//@Controller("contrroller")
@Component("contrroller")
public class BankController {
	
	@Autowired
	private ICustomerMgmtService  service;

	
	
	public String processCustomer(CustomerVO vo)throws Exception{
		
		//convert CustomerVo to CustomerDTO
		CustomerDTO dto=new CustomerDTO();
		
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));		
		//use service
		String result=service.calculateSimpleIntrestAmount(dto);
		return result;
		
	}

}
