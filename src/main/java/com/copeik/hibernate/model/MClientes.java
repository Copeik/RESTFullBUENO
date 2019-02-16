package com.copeik.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Clientes;


public class MClientes {

	private static final long serialVersionUID =1L;
	
	public int codcliente;
	public String nombre;
	public String Contrasena;
	public String correo;
	public int telefono;
	public MDireccion dir;
	
	public MClientes(Clientes cli) {
		this.codcliente = cli.getCod_cliente();
		this.nombre = cli.getNombre();
		Contrasena = cli.getContrasena();
		this.correo = cli.getCorreo();
		this.telefono = cli.getTelefono();
		this.dir = new MDireccion(cli.getDir().getId_direc(), cli.getDir().getDirec());
	}
	
	public MClientes(int cod_cliente, String nombre, String contrasena, String correo, int telefono, MDireccion dir) {
		super();
		this.codcliente = cod_cliente;
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
		this.codcliente = cod_cliente;
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
		this.telefono = telefono;
	}
	public MDireccion getDir() {
		return dir;
	}
	public void setDir(MDireccion dir) {
		this.dir = dir;
	}
	
	
	
	
}
