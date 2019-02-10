package com.copeik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Trabajadores;


public class MTrabajadores {
	
	private static final long serialVersionUID =1L;

	public int cod_trabajador;

	public String contrasena;
	
	
	public MTrabajadores(Trabajadores tra) {
		this.cod_trabajador = tra.codtrabajador;
		this.contrasena = tra.contrasena;
	}
	
	public MTrabajadores() {
	}
	
	public MTrabajadores(int cod_trabajador, String contrasena) {
		super();
		this.cod_trabajador = cod_trabajador;
		this.contrasena = contrasena;
	}

	public int getCod_trabajador() {
		return cod_trabajador;
	}

	public void setCod_trabajador(int cod_trabajador) {
		this.cod_trabajador = cod_trabajador;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
