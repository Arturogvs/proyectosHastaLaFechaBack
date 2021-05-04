package com.everis.formativa12.Models;

import org.springframework.stereotype.Controller;

@Controller

public class ControladorModel {

	// Atributos
	String nombre;
	String apellido;
	String limite;
	String codigoPostal;

	// Controlador
	public ControladorModel() {
	}

	public ControladorModel(String nombre, String apellido, String limite, String codigoPostal) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.limite = limite;
		this.codigoPostal = codigoPostal;
	}

	// Get & Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLimite() {
		return limite;
	}

	public void setLimite(String limite) {
		this.limite = limite;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	// Metodos
	public String ValidarNombre() {
		// Declarar
		String resultado = ""; // NULL

		if (this.nombre.equals("")) {
			resultado = "Campo Nombre es Requerido";
			// System.out.println("nombre campo invalido");
			return resultado;

		} else {
			return resultado;
		}
	}

	public String ValidarApellido() {
		// Declarar
		String resultado = ""; // NULL

		if (this.apellido.equals("")) {
			resultado = "Campo Apellido es Requerido";
			return resultado;
		} else {
			return resultado;
		}
	}

	public String ValidarLimite() {
		// Declarar
		String resultado = ""; // NULL

		if (this.limite.equals("")) {
			resultado = "Campo Limite es Requerido";
			return resultado;
		} else {
			return resultado;
		}
	}

	public String ValidarCodigopostal() {
		// Declarar
		String resultado = ""; // NULL

		if (this.codigoPostal.equals("")) {
			resultado = "Campo Codigo Postal es Requerido";
			return resultado;
		} else {
			return resultado;
		}
	}

	public String largoNombre() {
		if (this.nombre.length() > 0 && this.nombre.length() < 11) {
			return "";
		} else {
			return "Nombre no cumple con caracteres mínimos o máximos";
		}
	}

	public String largoApellido() {
		if (this.apellido.length() > 0 && this.apellido.length() < 11) {
			return "";
		} else {
			return "Apellido no cumple con caracteres mínimos o máximos";
		}
	}

	/*
	 * public String largoLimite() { if (this.limite.matches("[0-9]*")) { if
	 * (this.limite.length() < 6 && Integer.parseInt(this.limite) > 0) { return "";
	 * }else { return "El límite no cumple con los requisitos mínimos"; } } else {
	 * return ""; }
	 * 
	 * }
	 */

	public String largoLimite() {



			if (isNumeric(this.limite)) {
				if (this.limite.length() < 6 && Integer.parseInt(this.limite) > 0) {
					return "";
				} else {
					return "El límite debe ser positivo y inferior a 6 digitos";
				}
			} else {
				return "Campo debe ser numerico";
			}

	

	}
	
	  public static boolean isNumeric(String cadena) {

	        boolean resultado;

	        try {
	            Integer.parseInt(cadena);
	            resultado = true;
	        } catch (NumberFormatException excepcion) {
	            resultado = false;
	        }

	        return resultado;
	    }

	public String largoCodigo() {
		
		if(isNumeric(this.codigoPostal)) {
			
			if(this.codigoPostal.length()==8){
				return "";
			}
			return "Codigo Postal Debe Tener 8 Digitos";
		}
		
		return "Codigo Postal Debe Ser Numerico";
	}
}


