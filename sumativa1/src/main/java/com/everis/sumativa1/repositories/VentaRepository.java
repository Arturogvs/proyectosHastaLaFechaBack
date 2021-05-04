package com.everis.sumativa1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.everis.sumativa1.models.Venta;

public interface VentaRepository extends CrudRepository<Venta, Long>{

	List<Venta> findAll();
}
