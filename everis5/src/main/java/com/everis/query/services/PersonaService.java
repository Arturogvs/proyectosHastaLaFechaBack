package com.everis.query.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.query.models.Persona;
import com.everis.query.repositories.PersonaRepository;
@Service
public class PersonaService {
 @Autowired
 PersonaRepository personaRepository;
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaRepository.save(persona);
	}

}
