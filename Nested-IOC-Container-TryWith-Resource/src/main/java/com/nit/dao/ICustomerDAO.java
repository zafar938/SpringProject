package com.nit.dao;

import java.util.List;

import com.nit.bo.CustomerBO;

public interface ICustomerDAO {
	public List<CustomerBO> getCustomerByDetail(float cost)throws Exception;

}
