package com.everis.formativa12.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.formativa12.Models.Alumnno;
import com.everis.formativa12.services.AlumnoService;

@Controller
public class AlumnoController {
	
	/*
	private final AlumnoService alumnoService;
		public AlumnosController(AlumnoService alumnoService) {
			this.alumnoService=alumnoService;
			
		}
	*/
	@Autowired
	AlumnoService alumnoService;	
	
		@RequestMapping("/alumnos")
		public String alumnos(@RequestParam(value = "nombre") String nombre,
				@RequestParam(value = "pass") String pass, Model model) {
			
			Alumnno alumno = new Alumnno();
			alumno.setNombre(nombre);
			alumno.setPassword(pass);
			alumno.setEdad(1);
			
			alumno=alumnoService.guardarAlumno(alumno);
			
			model.addAttribute("nombre", nombre);
			model.addAttribute("pass", pass);
			model.addAttribute("id", alumno.getId());
			
			return "inicio.jsp";
}
}