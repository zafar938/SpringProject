package com.nit.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository("authDAO")
public class AuthenticationDAOImp implements IAuthenticationDAO {
    @Autowired
	private  SimpleJdbcCall sjc;
	@Override
	public String autheticate(String user, String pwd) {
		//set procedure name
		sjc.setProcedureName("P_AUTHENTICATION");
		//prepare Map of In  param name and values
		Map<String,Object> inParams=Map.of("USER",user,"PASS",pwd);
		//execute/call pl/sql procedure
		Map<String,Object> outParams=sjc.execute(inParams);
		//gether result
		return (String) outParams.get("RESULT");
	}

}
