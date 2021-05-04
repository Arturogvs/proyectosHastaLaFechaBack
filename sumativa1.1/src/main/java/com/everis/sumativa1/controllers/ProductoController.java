package com.everis.sumativa1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.everis.sumativa1.models.Producto;
import com.everis.sumativa1.services.ProductoService;


@Controller
public class ProductoController {

	@Autowired
		ProductoService productoService;
	
	@RequestMapping("/listarProductos")
	public String listarProductos( Model model) {
		List<Producto> lista_producto=productoService.listarProducto();
		System.out.println(lista_producto);
		model.addAttribute("lista_producto",lista_producto);
		return "listaProducto.jsp";
	}
	
	@RequestMapping("/eliminarProductos/{id}")
	public String eliminarProductos(@PathVariable("id") Long id) {
		
		productoService.eliminarProducto(id);
		
		return "redirect:/listarProductos";
	}
	
	//paso de productos a formulario actualizador
	
	@RequestMapping("/actualizarProductos/{id}/{codigo}/{nombre}/{descripcion}/{precio}")
	public String actualizarFormProductos(@PathVariable("id") Long id,@PathVariable("codigo") String codigo,
			@PathVariable("nombre") String nombre,@PathVariable("descripcion") String descripcion,
			@PathVariable("precio") String precio,Model model) {
		
		return "actualizarProducto.jsp";
	}
	
	// actualiza en bd
	@RequestMapping("/actualizarProductos")
	public String actualizarProductos(@RequestParam(value = "id") Long id,@RequestParam(value = "codigo") String codigo,
			@RequestParam(value = "nombre") String nombre, @RequestParam(value = "descripcion") String descripcion,
			@RequestParam(value = "precio") String precio, Model model) {
				
				Producto producto = new Producto();
				producto.setId(id);
				producto.setCodigo(codigo);
				producto.setNombre(nombre);
				producto.setDescripcion(descripcion);
				producto.setPrecio(precio);
				
				producto = productoService.guardarProducto(producto);
				
				
				return "redirect:/listarProductos";
		
	}
	
	
	@RequestMapping("/ingresarProductos")
	public String producto(@RequestParam(value = "codigo") String codigo,
			@RequestParam(value = "nombre") String nombre, @RequestParam(value = "descripcion") String descripcion,
			@RequestParam(value = "precio") String precio, Model model) {
				
				Producto producto = new Producto();
				
				producto.setCodigo(codigo);
				producto.setNombre(nombre);
				producto.setDescripcion(descripcion);
				producto.setPrecio(precio);
				
				producto = productoService.guardarProducto(producto);
				
				
				model.addAttribute("id", producto.getId());
				model.addAttribute("codigo", producto.getCodigo());
				model.addAttribute("nombre", producto.getNombre());
				model.addAttribute("descripcion", producto.getDescripcion());
				model.addAttribute("precio", producto.getPrecio());
				System.out.println("campos de productos : "+codigo+" "+nombre+" "+descripcion+" "+precio);
			
			
				
				return "redirect:/listarProductos";
		
	}
	


}
