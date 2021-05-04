package com.everis.ejercicio2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libro")
public class InicioController {
	
	@RequestMapping("/inicio")
	public String inicio() {
		return "esta es la clase InicioController";
	}

}
