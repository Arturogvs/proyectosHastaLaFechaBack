package com.everis.formativa12.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.formativa12.Models.Alumnno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumnno, Long> {

	List<Alumnno> findAll();
}
