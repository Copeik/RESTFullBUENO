package com.copeik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class MDireccion {

	private static final long serialVersionUID =1L;
	@Id
	@Column(name="id_direc")
	public int id_direc;
	@Column(name="direc")
	public String direc;
	
	public MDireccion() {
		
	}
	
	public MDireccion(int id_direc, String direc) {
		this.id_direc = id_direc;
		this.direc = direc;
	}
	
	
	public int getId_direc() {
		return id_direc;
	}
	public void setId_direc(int id_direc) {
		id_direc = id_direc;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}

	
	
	
	
	
}
