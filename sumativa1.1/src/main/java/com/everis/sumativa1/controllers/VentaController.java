package com.everis.sumativa1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.everis.sumativa1.models.Producto;
import com.everis.sumativa1.models.Venta;
import com.everis.sumativa1.services.VentaService;

@Controller
public class VentaController {

	@Autowired
	VentaService ventaService;
	@RequestMapping("/ingresarVentas")
	public String ingresarVentas(@RequestParam(value = "codigo") String codigo,
			@RequestParam(value = "producto") String producto, @RequestParam(value = "cantidad") String cantidad,
			@RequestParam(value = "usuario") String usuario, Model model) {
				System.out.println(producto);
		Venta venta = new Venta();
		
		venta.setCodigo(codigo);
		venta.setProducto(producto);
		venta.setCantidad(cantidad);
		venta.setUsuario(usuario);
		
		
		venta = ventaService.guardarVenta(venta);
		
		
		return "redirect:/listarVentas";

	}	
	
	@RequestMapping("/listarVentas")
	public String listarVentas( Model model) {
		List<Venta> lista_venta=ventaService.listarVenta();
		System.out.println(lista_venta);
		model.addAttribute("lista_venta",lista_venta);
		return "listaVenta.jsp";
	}
	
	@RequestMapping("/eliminarVentas/{id}")
	public String eliminarVentas(@PathVariable("id") Long id) {
		
		ventaService.eliminarVenta(id);
		
		return "redirect:/listarVentas";
	}
	
	@RequestMapping("/actualizarVentas/{id}/{codigo}/{producto}/{cantidad}/{usuario}")
	public String actualizarFormVentas(@PathVariable("id") Long id,@PathVariable("codigo") String codigo,
			@PathVariable("producto") String producto,@PathVariable("cantidad") String cantidad,
			@PathVariable("usuario") String usuario,Model model) {
		
		return "actualizarVenta.jsp";
	}
	
	@RequestMapping("/actualizarVentas")
	public String actualizarVENTAS(@RequestParam(value = "id") Long id,@RequestParam(value = "codigo") String codigo,
			@RequestParam(value = "producto") String producto, @RequestParam(value = "cantidad") String cantidad,
			@RequestParam(value = "usuario") String usuario, Model model) {
				
		Venta venta = new Venta();
		
		venta.setId(id);
		venta.setCodigo(codigo);
		venta.setProducto(producto);
		venta.setCantidad(cantidad);
		venta.setUsuario(usuario);
		
		
		venta = ventaService.guardarVenta(venta);
		
		
		return "redirect:/listarVentas";

	}	
}

	
	

