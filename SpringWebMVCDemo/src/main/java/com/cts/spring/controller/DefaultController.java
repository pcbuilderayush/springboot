package com.cts.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
	@RequestMapping({"","/","/home"})
	public ModelAndView defaultGetRequestHandler() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		mv.addObject("pageTitle","Home Page - Welcome All");
		mv.addObject("Developers",new String[] {"Ayush","Pratap","Singh"});
		
		return mv;
	}
	
}
