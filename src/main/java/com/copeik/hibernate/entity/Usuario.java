package com.copeik.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="contrasena")
	private String contrasena;
	
	@OneToOne()  
	@JoinColumn(name = "id_rol")
	private Rol rol;
	
	@Column
	private boolean activo;

	@Column(name="correo")
	public String correo;
	
	@Column(name="telefono")
	public int telefono;
	
	@OneToOne(cascade = CascadeType.ALL)   
	@JoinColumn(name = "id_direc")
	public Direccion dir;
	
	
	public Usuario() {
		
	}

	public Usuario(long id, String usuario, String nombre, String apellidos, String contrasena, Rol rol, boolean activo,
			String correo, int telefono, Direccion dir) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasena = contrasena;
		this.rol = rol;
		this.activo = activo;
		this.correo = correo;
		this.telefono = telefono;
		this.dir = dir;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
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



	public Direccion getDir() {
		return dir;
	}



	public void setDir(Direccion dir) {
		this.dir = dir;
	}
	

}
