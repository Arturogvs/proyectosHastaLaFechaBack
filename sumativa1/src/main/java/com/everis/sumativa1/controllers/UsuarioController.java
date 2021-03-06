package com.everis.sumativa1.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa1.models.Usuario;
import com.everis.sumativa1.services.UsuarioService;

	

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping("/listarUsuarios")
	public String listarUsuarios( Model model) {
		List<Usuario> lista_usuario=usuarioService.listarUsuario();
		model.addAttribute("lista_usuario",lista_usuario);
		return "listaUsuario.jsp";
	}
	
	@RequestMapping("/ingresarUsuarios")
	public String usuarios(@RequestParam(value = "rut") String rut,
			@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido,
			@RequestParam(value = "pass") String pass, Model model) {
				
		Usuario usuario = new Usuario();
		
		usuario.setRut(rut);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setPass(pass);
	
	
		usuario = usuarioService.guardarUsuario(usuario);
		
	
		
		return "redirect:/listarUsuarios";
		
	}
	
	@RequestMapping("/editarUsuarios/{id}")
	public String actualizarFormUsuarios(@PathVariable("id") Long id,Model model) {
		
		Optional<Usuario> usuario = usuarioService.buscarUsuario(id);
		model.addAttribute("usuario", usuario);
		
		return "actualizarUsuario.jsp";
	}
	
	@RequestMapping("/actualizarUsuarios")
	public String actualizarUsuarios(@Valid @ModelAttribute("usuario") Usuario usuario) {
				
		usuarioService.guardarUsuario(usuario);

		
		return "redirect:/listarUsuarios";
		
	}
	
	@RequestMapping("/eliminarUsuarios/{id}")
	public String eliminarUsuarios(@PathVariable("id") Long id) {
		
		usuarioService.eliminarUsuario(id);
		
		return "redirect:/listarUsuarios";
	}
	
}
