package com.everis.query.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licencias")
public class Licencia {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private boolean estado;
	private Date expiracion;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updateAt;

	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="persona_id")
	private Persona persona;
	
	public Licencia(Long id, String numero, boolean estado, Date expiracion, Date createdAt, Date updateAt) {
		super();
		this.id = id;
		this.numero = numero;
		this.estado = estado;
		this.expiracion = expiracion;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}

	public Licencia() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Date getExpiracion() {
		return expiracion;
	}

	public void setExpiracion(Date expiracion) {
		this.expiracion = expiracion;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	
}
