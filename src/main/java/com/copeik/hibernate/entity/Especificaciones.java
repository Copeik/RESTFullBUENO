package com.copeik.hibernate.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name= "Especificaciones") 
public class Especificaciones implements Serializable{

	private static final long serialVersionUID =1L;
	
	@EmbeddedId
	public EspecificacionesID id;
	@Column(name="cantidad")
	public int cantidad;
	@Column(name="precio")
	public double precio;
	
	public Especificaciones() {
	}


	public Especificaciones(EspecificacionesID id, int cantidad, double precio) {
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public EspecificacionesID getId() {
		return id;
	}

	public void setId(EspecificacionesID id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
