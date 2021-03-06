package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String helloworld(ModelMap model){
		model.addAttribute("message", "Hello there!");
		return "hello";
	}

}
