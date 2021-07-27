package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.Emplyee;
import com.nit.service.EmployeeMgmService;

@Controller
@RequestMapping("/employee")
public class EmployeeOperationController {
	@Autowired
	private EmployeeMgmService service;
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
		
	}
	@GetMapping("/employee_edit")
	public String showEmployee(@ModelAttribute("emp")Emplyee emp,@RequestParam("eno")int no) {
		//use service
		Emplyee e1=service.fetchEmployeeDetailsById(no);
		//copy to Model class obj
		BeanUtils.copyProperties(e1, emp);
		return "employee_modify";
		
	}
  @GetMapping("/empReport")
  public String generateReport(Map<String,Object>map){
	//use service obj
	  Iterable<Emplyee> listEmps=service.fetchAllEmps();
	  map.put("empsList", listEmps);
	  //return LVN
	  return "employee_report";
	  
  }
	
	  @PostMapping("/employee_edit")
	  public String updateEmployee(Map<String,Object> map,@ModelAttribute("emp")Emplyee emp) {
	  //use service class obj 
	  String updationMsg=service.modifyEmplolyeeDetailByEno(emp); 
	  Iterable<Emplyee>listEmps=service.fetchAllEmps(); 
	  //keep result in model attribute
	  map.put("resultMsg", updationMsg); 
	  map.put("empsList", listEmps);
	  return"employee_report";
	  
	  }
	 
  /*@PostMapping("/employee_edit")
  public String updateEmployee(RedirectAttributes attrs,@ModelAttribute("emp")Emplyee emp) {
	//use service class obj
	  String updationMsg=service.modifyEmplolyeeDetailByEno(emp);
	  //List<Emplyee> listEmps=service.fetchAllEmployeeDetails();
	  //kepp result  in model attribute
	  attrs.addFlashAttribute("resultMsg", updationMsg);
	  //map.put("empsList", listEmps);
	  return "redirect:empReport";
	  
  }*/
	  @GetMapping("/employee_delete")
	  public String deleteEmplolyee(Map<String,Object>map,@RequestParam("eno")Integer no) {
		//use service obj
		  String deleteMsg=service.fireEmployeeByNO(no);
		  Iterable<Emplyee> listEmps=service.fetchAllEmps();
		  
		  map.put("resultMsg", deleteMsg);
		  map.put("empsList", listEmps);
		  
		return "employee_report";
		  
	  }
}
