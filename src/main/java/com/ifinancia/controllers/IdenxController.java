package com.ifinancia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IdenxController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}

	
}
