package com.nit.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.service.ILocaleMgmtService;

@Controller("controller")
//@RequestMapping("/locale")
public class LocaleOperationsConstroller {
	@Autowired
	private ILocaleMgmtService service;
	
	@RequestMapping("test/welcome")
	public String showHomePage() {
		return "home";
	}
	
	/*
	 * @RequestMapping("/list_countries") public ModelAndView fetchCountries() {
	 * List<String> countrieList=service.fetchAllCountries(); ModelAndView mav=new
	 * ModelAndView(); mav.addObject("countriesInfo",countrieList);
	 * mav.addObject("sysDate",LocalDateTime.now()); mav.setViewName("result");
	 * return mav;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/list_countries") public String fetchCountries(Model model)
	 * {
	 * System.out.println("Modle Attribute Specific object Data :: "+model.getClass(
	 * )); List<String> countrieList=service.fetchAllCountries();
	 * model.addAttribute("countriesInfo",countrieList);
	 * model.addAttribute("sysDate", LocalDateTime.now()); return "result";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public String fetchCountries(ModelMap
	 * model) {
	 * System.out.println("Modle Attribute Specific object Data :: "+model.getClass(
	 * )); List<String> countrieList=service.fetchAllCountries();
	 * model.addAttribute("countriesInfo",countrieList);
	 * model.addAttribute("sysDate", LocalDateTime.now()); return "result";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public String
	 * fetchCountries(Map<String,Object>map) {
	 * System.out.println("Modle Attribute Specific object Data :: "+map.getClass())
	 * ; List<String> countrieList=service.fetchAllCountries();
	 * map.put("countriesInfo",countrieList); map.put("sysDate",
	 * LocalDateTime.now()); return "result";
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public void
	 * fetchCountries(Map<String,Object>map) {
	 * System.out.println("Modle Attribute Specific object Data :: "+map.getClass())
	 * ; List<String> countrieList=service.fetchAllCountries();
	 * map.put("countriesInfo",countrieList); map.put("sysDate",
	 * LocalDateTime.now());
	 * 
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public ModelMap fetchCountries() {
	 * 
	 * List<String> countrieList=service.fetchAllCountries(); ModelMap map=new
	 * BindingAwareModelMap(); map.put("countriesInfo",countrieList);
	 * map.put("sysDate", LocalDateTime.now()); return map;
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public Model fetchCountries() {
	 * 
	 * List<String> countrieList=service.fetchAllCountries(); Model model=new
	 * BindingAwareModelMap(); model.addAttribute("countriesInfo",countrieList);
	 * model.addAttribute("sysDate", LocalDateTime.now()); return model;
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/list_countries") public Map<String,Object> fetchCountries()
	 * {
	 * 
	 * List<String> countrieList=service.fetchAllCountries(); Map<String,Object>
	 * map=new HashMap(); map.put("countriesInfo",countrieList); map.put("sysDate",
	 * LocalDateTime.now()); return map;
	 * 
	 * }
	 */
	@RequestMapping("/list_countries")
	public void fetchCountries(ModelAndView mav) {
		  
			List<String> countrieList=service.fetchAllCountries();
			
			mav.addObject("countriesInfo",countrieList);
			mav.addObject("sysDate", LocalDateTime.now());
			
			
		}
@RequestMapping("/")
public String showAboutPage() {	
	return "about_us";
	
}
@RequestMapping("/contact")
public String showContactPage() {
	return "contact_us";
	
}

/*
 * @RequestMapping(value="/",method=RequestMethod.POST) public String
 * showAboutUsPage1() {
 * System.out.println("LocaleOperationsConstroller.showAboutUsPage1()");
 * //return LVN return "about_us1"; }
 */

}
