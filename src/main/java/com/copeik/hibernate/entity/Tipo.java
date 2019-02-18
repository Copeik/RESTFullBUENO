package com.copeik.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name= "Tipo")
public class Tipo {
	
	/*
	 * Entidades , pojos de la base de datos
	 */
	
	
	private static final long serialVersionUID =1L;

	@Id
	@Column(name="codigo_t")
	public int codigo_t;
	@Column(name="nombre")
	public String nombre;
	
	public Tipo() {
	}
	
	public Tipo(int codigo_t, String nombre) {
		this.codigo_t = codigo_t;
		this.nombre = nombre;
	}

	public int getCodigo_t() {
		return codigo_t;
	}

	public void setCodigo_t(int codigo_t) {
		this.codigo_t = codigo_t;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
