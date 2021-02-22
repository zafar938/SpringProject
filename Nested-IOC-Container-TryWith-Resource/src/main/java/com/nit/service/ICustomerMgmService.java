package com.nit.service;

import java.util.List;

import com.nit.dto.CustomerDTO;

public interface ICustomerMgmService {
	
	public List<CustomerDTO> fetchCustomerDetail(float cost)throws Exception;

}
