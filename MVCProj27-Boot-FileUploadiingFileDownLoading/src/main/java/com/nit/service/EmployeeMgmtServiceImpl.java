package com.nit.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.nit.dao.IEmployeeDAO;
import com.nit.model.Employee;
@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
     @Autowired
	 private IEmployeeDAO dao;
     
	@Override
	public String uploadFiles(String destPath, Employee emp) throws Exception {
		File file=new File(destPath);
		if(!file.exists())
			  file.mkdir();
		//get MultipleFile Obj representing the upload files
		MultipartFile resume=emp.getResume();
		MultipartFile photo=emp.getPhoto();
		//get the names of the uploaded file
		String resumeFileName=resume.getOriginalFilename();
		String photoFileName=photo.getOriginalFilename();
		//get InputStream represent the upload files
		InputStream is1=resume.getInputStream();
		InputStream is2=photo.getInputStream();
		//create output stream pointing  Empty destination files of server machine file system
		OutputStream os1=new FileOutputStream(destPath+"\\"+resumeFileName);
		OutputStream os2=new FileOutputStream(destPath+"\\"+photoFileName);
		//copy inputStreams content to ouputputs
		IOUtils.copy(is1, os1);
		IOUtils.copy(is2, os2);
		//close the stream
		is1.close();is2.close();
		os1.close();os2.close();
		//set uploaded file names  Model class obj attributes
		emp.setResumeFileLocation(destPath+"\\"+resumeFileName);
		emp.setPhotoFileLocation(destPath+"\\"+photoFileName);
		//use dao
		int count=dao.insert(emp);
		return count==1?resumeFileName+" ,  "+photoFileName+"file are uploaded and emp is registered":"some problem in registration";
	}

	@Override
	public List<String> getAllFiles(String destPath) throws Exception {
		File destStore=new File(destPath);
		List<String> listFiles=new ArrayList();
		if(destStore.exists() && destStore.isDirectory()){
			File content[]=destStore.listFiles();
			for(File file:content) {
				if(file.isFile())
					listFiles.add(file.getAbsolutePath());
			}//for
		}//if
		return listFiles;
	}

	

}
