package com.everis.query.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String principal(){
		System.out.println("entre al index");
		return "";
		
		
	}
}
