package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IAuthenticationDAO;

@Service("loginService")
public class LoginMgmtServiceImpl implements ILoginMgmtService {
   
	@Autowired
	private IAuthenticationDAO dao;
	
	@Override
	public String login(String user, String pwd) {
		//use dao
		String result=dao.autheticate(user, pwd);
		return result;
	}

}
