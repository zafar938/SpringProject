package com.nit.service;

import java.util.List;

import com.nit.model.Employee;

public interface IEmployeeMgmtService {
    
	public String uploadFiles(String destPath,Employee emp)throws Exception;
	public List<String> getAllFiles(String destPath)throws Exception;
}
