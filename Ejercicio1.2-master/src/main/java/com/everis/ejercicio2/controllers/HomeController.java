package com.everis.ejercicio2.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	/*para detectar rutas o url */
	/*@RequestMapping("/")
	public String hola() {
		return "Hello World!";
	}*/
	
	@RequestMapping("/chao")
	public String chao() {
		return "Bye World!";
	}
	
	@RequestMapping("/parametro")
	public String parametro(@RequestParam(value="q") String pametros,
			@RequestParam(value="p", required = false) String parametro1,
			@RequestParam(value="edad") int edad) {
		return "Mi parametros es: " + pametros +" "+parametro1 +" edad:"+ edad;
	}
	
	@RequestMapping("/m/{modulo}/private/{seccion}/tarea/{tarea}")
	public String leccion(@PathVariable("modulo") String modulo,
			@PathVariable("seccion") String seccion,
			@PathVariable("tarea") String tarea
			) {
		
		return "Modulo: "+modulo+ " Seccion: "+ seccion +" Tarea: "+tarea;
	}
	@RequestMapping("/m/{modulo}/public/{seccion}/tarea/{tarea}")
	public String leccionPublic(@PathVariable("modulo") String modulo,
			@PathVariable("seccion") String seccion,
			@PathVariable("tarea") String tarea
			) {
		
		return "Modulo: "+modulo+ " Seccion: "+ seccion +" Tarea: "+tarea;
	}
}
