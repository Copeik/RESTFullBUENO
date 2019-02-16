package com.copeik.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name= "Clientes") 
public class Clientes {

	private static final long serialVersionUID =1L;
	@GeneratedValue
	@Id
	@Column(name="codcliente")
	public int codcliente;
	@Column(name="nombre")
	public String nombre;
	@Column(name="cotrasena")
	public String Contrasena;
	@Column(name="correo")
	public String correo;
	@Column(name="telefono")
	public int telefono;
	@OneToOne(cascade = CascadeType.ALL)   
	@JoinColumn(name = "id_direc")
	public Direccion dir;
	
	public Clientes() {
		
	}
	
	public Clientes(String nombre, String contrasena, String correo, int telefono, Direccion dir) {
		this.nombre = nombre;
		Contrasena = contrasena;
		this.correo = correo;
		this.telefono = telefono;
		this.dir = dir;
	}
	
	public int getCod_cliente() {
		return codcliente;
	}
	public void setCod_cliente(int cod_cliente) {
		codcliente = cod_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return Contrasena;
	}
	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		telefono = telefono;
	}
	public Direccion getDir() {
		return dir;
	}
	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	
	
	
	
}
