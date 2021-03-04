package com.nit.service;

import com.nit.dto.ProductDTO;

public interface IProductService {
	
	public String MrpGenrator(ProductDTO dto)throws Exception;

}
