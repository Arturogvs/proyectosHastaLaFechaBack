package com.everis.sumativa1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.everis.sumativa1.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	List<Usuario> findAll();
}
