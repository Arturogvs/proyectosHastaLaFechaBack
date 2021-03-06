package com.everis.formativa12.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.formativa12.Models.Alumnno;
import com.everis.formativa12.repositories.AlumnoRepository;


@Service
public class AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	public Alumnno guardarAlumno(Alumnno alumno) {
		// TODO Auto-generated method stub
		
		return alumnoRepository.save(alumno);
	}

	public List<Alumnno> allAlumnos() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	public Optional<Alumnno> findById(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}



	
}
