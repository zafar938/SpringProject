package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.bo.ProductBO;
import com.nit.dao.IProductDAO;
import com.nit.dto.ProductDTO;

@Component("custService")
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	//@Qualifier("oracleCustDAO")
	@Qualifier("mysqlCustDAO")
	private IProductDAO dao;
	
	  private float mrp;	  

	@Override
	public String MrpGenrator(ProductDTO dto) throws Exception {
		if(dto.getBaseprice()<5000)
			mrp=dto.getQty()*(dto.getBaseprice()+(dto.getBaseprice()*12/100));
		else if(dto.getBaseprice()<10000)
			mrp=dto.getQty()*(dto.getBaseprice()+(dto.getBaseprice()*15/100));
		else if(dto.getBaseprice()>10000)
			mrp=dto.getQty()*(dto.getBaseprice()+(dto.getBaseprice()*18/100));
		
		ProductBO bo=new ProductBO();
		
		bo.setPname(dto.getPname());
		bo.setType(dto.getType());
		bo.setQty(dto.getQty());
		bo.setBaseprice(dto.getBaseprice());
		bo.setMrp(mrp);
		
		//use DAO
		int count=dao.insert(bo);
		
		//immeridate if or ternary operator <code>?<sucess>:<failuare>
		
				return count==0?"Mrp genration failed":"Mrp genration Succeded :: Details are :: ProductName :: " +dto.getPname()+" Type :: "+dto.getType()+" Quantity :: "
				+dto.getQty()+" BasePrice :: "+dto.getBaseprice()+" MRP  :: "+mrp;
		
		
	}

}
