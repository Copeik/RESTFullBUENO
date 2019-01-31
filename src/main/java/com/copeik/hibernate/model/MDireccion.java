package com.copeik.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Direccion;


public class MDireccion {

	private static final long serialVersionUID =1L;
	public int iddirec;
	public String direc;
	
	public MDireccion() {
		
	}
	public MDireccion(Direccion dir) {
		this.iddirec = dir.iddirec;
		this.direc = dir.direc;
	}
	
	public MDireccion(int id_direc, String direc) {
		this.iddirec = id_direc;
		this.direc = direc;
	}
	
	
	public int getId_direc() {
		return iddirec;
	}
	public void setId_direc(int id_direc) {
		iddirec = id_direc;
	}
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}

	
	
	
	
	
}
