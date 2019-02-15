package com.copeik.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "Trabajadores") 
public class Trabajadores {
	
	private static final long serialVersionUID =1L;
	@GeneratedValue
	@Id
	@Column(name="codtrabajador")
	public int codtrabajador;
	@Column(name="nombre")
	public String nombre;
	@Column(name="contrasena")
	public String contrasena;
	
	
	
	public Trabajadores() {
	}
	
	public Trabajadores(String nombre, String contrasena) {
		
		this.nombre = nombre;
		this.contrasena = contrasena;
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
