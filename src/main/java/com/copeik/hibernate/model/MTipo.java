package com.copeik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Tipo;



public class MTipo {
	
	private static final long serialVersionUID =1L;

	public int codigo_t;

	public String nombre;
	
	public MTipo() {
	}
	
	public MTipo(Tipo t) {
		this.codigo_t = t.codigo_t;
		this.nombre = t.nombre;
	}
	
	public MTipo(int codigo_t, String nombre) {
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
