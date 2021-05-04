package com.everis.query.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.query.models.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
