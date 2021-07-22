package com.nit.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.model.Employee;
import com.nit.service.IEmployeeMgmtService;

@Controller
public class EmployeeFileUploadingController {
	@Autowired
	private IEmployeeMgmtService service;
	
	@Value("${dest.store.path}")
	private String destPath;
   
	@GetMapping("/")
	public String getFormPage() {
		//logical view name
		return "home";
		
	}
	@GetMapping("/register")
	public String showForm(@ModelAttribute("empForm")Employee emp) {
		//logical view name
		return "employee_register";
		
	}
	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute("empForm") Employee emp,Map<String,Object>map)throws Exception{
		String resultMsg=service.uploadFiles(destPath,emp);
		//keep the result to model attribute
		map.put("resultMsg", resultMsg);
		//return LNV
		return "show_results";
   }
	@GetMapping("/report")
	public String employeesReport(Map<String,Object>map)throws Exception{
		//use service
		List<String> fileList=service.getAllFiles(destPath);
		//add results to model attribute
		map.put("listFiles", fileList);
		//return lVN
		return "employee_report";
		
	}
	@Autowired
	private ServletContext sc;
	@GetMapping("/download")
	public String downloadFile(@RequestParam("fileName")String fname,HttpServletResponse res)throws Exception{
		//create java.io.File object pointing to the file to download
		File file=new File(fname);
		//get the length of the file and make it response content length
		res.setContentLengthLong(file.length());
		//take the file to be download MIME type and make it response content type
		String mimeType=sc.getMimeType(fname);
		res.setContentType(mimeType==null?"application/octet-stream":mimeType);
		//create InputStream pointing to the file to be download
		InputStream is=new FileInputStream(file);
		//make response obj disposing its content  as download file
		res.addHeader("Content-Disposition", "attachment;filename="+file.getName());
		//create Output Stream pointing to response obj
		OutputStream os=res.getOutputStream();
		//write  content of file to download to response obj using streams
          IOUtils.copy(is, os);
          is.close();
          os.close();
		return null;
		
	}
	
}
