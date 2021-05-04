package com.everis.ejercicio2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.ejercicio2.models.Alumno;


@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{

}
