package com.everis.ejercicio2.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.everis.ejercicio2.models.Celular;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String inicio(Model model) {
		ArrayList<Celular> listaCelulares = new ArrayList<Celular>();
		Celular celu = new Celular();
		celu.setMarca("Iphone");
		celu.setNumero("987654321");
		
		listaCelulares.add(celu);
		
		model.addAttribute("celular", celu);
		model.addAttribute("listaCelulares", listaCelulares);
		model.addAttribute("everisFirstName", "Israel");
		model.addAttribute("everisLastName", " Palma");
		return "index.jsp";
		
	}
}
