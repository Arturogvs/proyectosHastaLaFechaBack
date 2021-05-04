package com.everis.ejercicio2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AlumnosController {
	@RequestMapping("/alumnos")
	public String alumnos(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="pass") String pass,
			Model model) {
		System.out.println(nombre+" - "+pass);
		model.addAttribute("nombre", nombre);
		model.addAttribute("pass", pass);
		//return "inicio.jsp";
		return "redirect:/chao";
	}

}
