package com.nit.controller;

import com.nit.dto.CustomerDTO;
import com.nit.service.ICustomerMgmtService;
import com.nit.vo.CustomerVO;

public class BankController {
	
	private ICustomerMgmtService  service;

	public BankController(ICustomerMgmtService service) {
		this.service = service;
	}
	
	public String processCustomer(CustomerVO vo)throws Exception{
		
		//convert CustomerVo to CustomerDTO
		CustomerDTO dto=new CustomerDTO();
		
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));		
		//use service
		String result=service.calculateSimpleIntrestAmount(dto);
		return result;
		
	}

}
