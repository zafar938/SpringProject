package com.nit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nit.service.ILocaleMgmtService;

public class ListAllContriesController implements Controller {
	private ILocaleMgmtService service;
	
	
	public ListAllContriesController(ILocaleMgmtService service) {
		System.out .println("ListAllContriesController.ListAllContriesController()");
		this.service = service;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<String> listCountries=service.fetchAllCountries();
		
		return new ModelAndView("result","countriesInfo",listCountries);
	}

}
