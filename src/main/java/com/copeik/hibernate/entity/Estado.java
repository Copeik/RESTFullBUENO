package com.copeik.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "Estado") 
public class Estado {
	
	@GeneratedValue
	@Id
	@Column(name="id")
	public int id;
	
	@Column(name="estado")
	public String estado;
	
	
	public Estado() {

	}
	public Estado(int id, String estado) {
		super();
		this.id = id;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
