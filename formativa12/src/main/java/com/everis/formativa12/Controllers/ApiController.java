package com.everis.formativa12.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.formativa12.Models.Alumnno;
import com.everis.formativa12.services.AlumnoService;

@RestController
public class ApiController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@RequestMapping("/api/alumnos")
	public List<Alumnno> listaAlumnos(){
		List<Alumnno> alumnos_lista = alumnoService.allAlumnos();
		return alumnos_lista;
	}
	
	@RequestMapping("/api/alumnos/{id}")
	public Optional<Alumnno> buscarAlumno(@PathVariable("id") Long id){
	
	Optional<Alumnno> alumno = alumnoService.findById(id);
	
	return alumno;
		
		
	} 
	
}
