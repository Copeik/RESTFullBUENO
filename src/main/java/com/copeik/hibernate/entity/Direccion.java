package com.copeik.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "Direccion") 
public class Direccion implements Serializable{

	/*
	 * Entidades , pojos de la base de datos
	 */
	
	private static final long serialVersionUID =1L;
	@GeneratedValue
	@Id
	@Column(name="id_direc")
	public int iddirec;
	@Column(name="direc")
	public String direc;
	
	public Direccion() {
		
	}
	
	public Direccion(String direc) {
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
