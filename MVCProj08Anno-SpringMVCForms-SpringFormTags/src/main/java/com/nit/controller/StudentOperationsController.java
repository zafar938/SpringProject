package com.nit.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.Student;

@Controller
public class StudentOperationsController {
	
	@GetMapping("student_form")
	public String showForm(@ModelAttribute("stud")Student st) {
		System.out.println("StudentOperationsController.showForm()");
		return "register_student";
		
	}
	@PostMapping("student_form")
	public String registerStudent(Map<String,Object>map,@ModelAttribute("std")Student st) {
		System.out.println("StudentOperationsController.registerStudent()");
		//no model attributes
		  map.put("sysDate",LocalDateTime.now());
		  
		return "result";
		
	}

}
