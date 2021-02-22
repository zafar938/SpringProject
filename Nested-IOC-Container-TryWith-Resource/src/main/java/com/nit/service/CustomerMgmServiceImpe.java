package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.bo.CustomerBO;
import com.nit.dao.ICustomerDAO;
import com.nit.dto.CustomerDTO;
@Component("CustService")
public class CustomerMgmServiceImpe implements ICustomerMgmService {
    @Autowired
	private ICustomerDAO dao;
	@Override
	public List<CustomerDTO> fetchCustomerDetail(float cost) throws Exception {
		
		//use dao class
		List<CustomerBO> listBO=dao.getCustomerByDetail(cost);
		//convert listBO to listDTO
		List<CustomerDTO> listDTO=new ArrayList();
		listBO.forEach(bo->{
			//copy each bo to dto
		  CustomerDTO dto=new CustomerDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSerialNo(listDTO.size()+1);
			//add in listDTO from dto
			listDTO.add(dto);
		});
		
		return listDTO;
	}

}
