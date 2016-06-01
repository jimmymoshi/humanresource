package tz.humanresource.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView; 
  
import tz.humanresource.model.Employee;
import tz.humanresource.model.Loginform;
import tz.humanresource.model.SearchParams;
import tz.humanresource.model.User;
import tz.humanresource.services.*;
import tz.humanresource.services.Empservice;


@Controller
@RequestMapping("/")
public class AppController {
	  
	 @Autowired  
	 Empservice service;
	 Loginservice logging;
	
	 @RequestMapping(value = {"/", "/login"}, method= RequestMethod.GET)
		public String login(ModelMap model)
	 {
			//Loginform loginForm = new Loginform();
			//model.addAttribute("loginForm", loginForm);
		 
			return "login";
		}
	 
	  
	 @RequestMapping(value = {"/form"}, method= RequestMethod.GET)  
	 public String registrationform(ModelMap model) {
		 
		 Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 
		 
	        User user=null;
	        if (principal instanceof User) {
	        user = ((User)principal);
	        
	        String name = user.getUsername();
		    model.addAttribute("username", name);
	        }
	        
	        
	     
	    
	   
	   
		 
		Employee employee = new Employee();
		 
			model.addAttribute("employee", employee);
			
			return "form";
	    
	 }
	 
	  
	 @RequestMapping(value = { "/Register" }, method = RequestMethod.POST) 
	 public  String Register( @ModelAttribute ("employee") Employee employee, BindingResult result, ModelMap model) {  
		 
		
		 service.saveEmployee(employee);
		    model.addAttribute("firstname", employee.getFirstname());
	        model.addAttribute("middlename", employee.getMiddlename());
	        model.addAttribute("lastname", employee.getLastname());
	        model.addAttribute("Title", employee.getTitle());
	        model.addAttribute("DOE", employee.getDoe());
	        model.addAttribute("address", employee.getAddress());
	        model.addAttribute("salary", employee.getSalary());
	        model.addAttribute("pension", employee.getPension());
	        model.addAttribute("loans", employee.getLastname());
	        model.addAttribute("department", employee.getDepartment());
	        return "success";

	    
	 }  
	  
	
	 @RequestMapping(value = {"/list" }, method = RequestMethod.GET)
	 public String getlist(ModelMap model) 
	 {  
	  List<Employee> employeeList = service.findAllEmployees(); 
	  model.addAttribute("emp", employeeList);
	  return "list";  
	 }  
	  
	 @RequestMapping(value ={"processform"}, params="delete")  
	 public String deleteUser(@RequestParam (value="empid") int id) {  
	  service.deleteRow(id);  
	  return("list");  
	 }  
	 
	
	  
	 @RequestMapping(value={"processform"}, params= "update")  
	 public ModelAndView updateUser(@ModelAttribute Employee employee) {  
	 service.updateRow(employee);  
	  return new ModelAndView("redirect:list");  
	}  
	 @RequestMapping(value = "/search", method = RequestMethod.GET)
	 public String search(ModelMap model) throws Exception
	 {
		 model.addAttribute("searchParams", new SearchParams());
		 model.addAttribute("employee", new Employee());

	     //model.addAttribute("empid", searchParams.getEmpid());
	    

	     return "search";
	 }

	 @RequestMapping(value="/submitSearch", method = RequestMethod.GET)
	public String submitSearch(ModelMap model, @Valid @ModelAttribute("searchParams") SearchParams searchParams, @ModelAttribute("employee") Employee employee, BindingResult bindingResult, HttpServletRequest request) 
	                 throws Exception{

	     // perform Search
	     Employee searchResults = (Employee) service.findById(searchParams.getEmpid());
	     model.addAttribute("searchResults", searchResults);
	     model.addAttribute("searchParams", searchParams);

	     return "formedit";
	 
	 
	 }
	 
	 
	 @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	    public String loginerror(ModelMap model) {
	        model.addAttribute("error", "true");
	        return "denied";
	    }
	 
	}  

