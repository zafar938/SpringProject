package com.nit.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.dto.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value="/student_form",method=RequestMethod.GET)
	public String showFormPage() {
		System.out.println("StudentController.showFormPage()");
		return "register_student";
		
	}
	@RequestMapping(value="/student_form",method=RequestMethod.POST)
	public String regesterStudent(Map<String,Object>map,@ModelAttribute Student student) {
	//public String registerStudent(Map<String,Object>map,@ModelAttribute("stud") Student st){	
	System.out.println("StudentController.regesterStudent()");
		map.put("sysDate", LocalDateTime.now());
		return "result";
	}

}
