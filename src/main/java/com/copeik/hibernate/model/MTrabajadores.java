package com.copeik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Trabajadores;


public class MTrabajadores {
	
	private static final long serialVersionUID =1L;

	public int codtrabajador;
	
	public String nombre;

	public String contrasena;
	
	
	public MTrabajadores(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}

	public MTrabajadores() {
	}
	
	public MTrabajadores(Trabajadores tra) {
		this.codtrabajador = tra.codtrabajador;
		this.nombre = tra.nombre;
		this.contrasena = tra.contrasena;
	}

	public int getCod_trabajador() {
		return codtrabajador;
	}

	public void setCod_trabajador(int cod_trabajador) {
		this.codtrabajador = cod_trabajador;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
