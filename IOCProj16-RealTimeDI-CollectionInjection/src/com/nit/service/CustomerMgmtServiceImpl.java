package com.nit.service;

import com.nit.bo.CustomerBo;
import com.nit.dao.ICustomerDAO;
import com.nit.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	
	private ICustomerDAO dao;
		
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String calculateSimpleIntrestAmount(CustomerDTO dto) throws Exception {
		//write b.logic to calculate simple interestAmount based on pAmt,rate,time
		float intrAmt=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		 
		//prepare CustomerBo object having persistable data
		CustomerBo bo=new CustomerBo();
		
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getpAmt());
		bo.setTime(dto.getTime());
		bo.setRate(dto.getRate());
		bo.setIntrAmt(intrAmt);
		
		//use DAO
		int count=dao.insert(bo);
		
		//immeridate if or ternary operator <code>?<sucess>:<failuare>
		
		return count==0?"Customer Registration Failed":"Customer Registration Succeded :: Details are :: Principle Amount :: " +dto.getpAmt()+" Time :: "+dto.getTime()+" Rate :: "+dto.getRate()+" InerestAmount :: "+intrAmt;
	}

}
