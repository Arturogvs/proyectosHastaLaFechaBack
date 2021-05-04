package com.everis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class formularioController {

	@RequestMapping("/")
	public String index("/") {
		
		
		return "/formPersona.jsp";
	}
	
}
