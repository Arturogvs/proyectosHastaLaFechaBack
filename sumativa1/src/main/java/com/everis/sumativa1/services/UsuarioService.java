package com.everis.sumativa1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa1.models.Usuario;
import com.everis.sumativa1.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired 
	UsuarioRepository usuarioRepository;
	
	public Usuario guardarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> listarUsuario(){
		
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> buscarUsuario(Long id){
		
		return usuarioRepository.findById(id);
	}
	
	
	public void eliminarUsuario(Long id) {
		
		usuarioRepository.deleteById(id);
		
	}
}
