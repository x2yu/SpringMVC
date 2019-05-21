package com.x2y.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController{

	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message","Hello SpringMVC");
		return mav;
	}
	
	@RequestMapping("/jump")
	public ModelAndView jump() {
		ModelAndView mav = new ModelAndView("redirect:/index");
		return mav;
	}

}
