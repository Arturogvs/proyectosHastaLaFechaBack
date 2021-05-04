package com.everis.controllers.persona;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class personaController {

	
	
	@RequestMapping("/form")
	public String formPersona() {
		System.out.println("entre al index");
		return("/formPersona.jsp");
		
	}
}
