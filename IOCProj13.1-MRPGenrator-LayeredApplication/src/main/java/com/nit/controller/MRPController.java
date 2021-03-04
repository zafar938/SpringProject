package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.dto.ProductDTO;
import com.nit.service.IProductService;
import com.nit.vo.ProductVO;

@Component("controller")
public class MRPController {
  
	
	@Autowired
	private IProductService service;
	
	public String processMrpgenrator(ProductVO vo) throws Exception{
		
		ProductDTO dto=new ProductDTO();
		
		dto.setPname(vo.getPname());
		dto.setType(vo.getType());
		dto.setQty(Float.parseFloat(vo.getQty()));
		dto.setBaseprice(Float.parseFloat(vo.getBaseprice()));
				
		//use service
				String result=service.MrpGenrator(dto);
				return result;
	
	}
}
