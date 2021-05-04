package com.everis.sumativa1.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.sumativa1.models.Producto;
import com.everis.sumativa1.repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	// GuardarProducto
	public Producto guardarProducto(Producto producto) {
		
		return productoRepository.save(producto);
	}
	
	// ListarProducto
	public List<Producto> listarProducto() {
		
		return productoRepository.findAll();
	}

	// ActualizarProducto
	public Producto actualizarProducto(Producto producto) {
	
	return productoRepository.save(producto);
}

	//EliminarProducto
	public void eliminarProducto(Long id) {
	
		productoRepository.deleteById(id);
		
	}
	
	
	

}
