package com.everis.sumativa1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa1.models.Venta;
import com.everis.sumativa1.repositories.VentaRepository;

@Service
public class VentaService {

	@Autowired
	VentaRepository ventaRepository;
	
	
	public Venta guardarVenta(Venta venta) {
		return ventaRepository.save(venta);
	}
	
	public List<Venta> listarVenta(){
		
		return ventaRepository.findAll();
	}
	
	public void eliminarVenta(Long id) {
		
		ventaRepository.deleteById(id);
		
	}
	
	
}
