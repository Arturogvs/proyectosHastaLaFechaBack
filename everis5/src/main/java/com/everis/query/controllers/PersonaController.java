package com.everis.query.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.query.models.Persona;
import com.everis.query.services.PersonaService;

@Controller
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	PersonaService personaService;
	
	@RequestMapping("")
	public String main(){
		
		return "index.jsp";
		
		
	}
	
	
	@RequestMapping("/insertar")
	public String insertarPersona(@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido ) {
			Persona persona = new Persona();
			persona.setNombre(nombre);
			persona.setApellido(apellido);
			
			persona=personaService.save(persona);
		
		return ("");
	}
	
}
