package com.ifinancia.ifinancia;

import org.springframework.web.bind.annotation.RequestMapping;

public class IdenxController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index.html";
	}

}
