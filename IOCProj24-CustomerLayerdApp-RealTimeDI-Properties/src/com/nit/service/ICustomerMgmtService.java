package com.nit.service;

import com.nit.dto.CustomerDTO;

public interface ICustomerMgmtService {
	
	public String  calculateSimpleIntrestAmount(CustomerDTO dto)throws Exception;

}
