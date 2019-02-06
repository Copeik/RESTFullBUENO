package com.copeik.hibernate.model;

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

import com.copeik.hibernate.entity.Especificaciones;


public class MEspecificaciones implements Serializable{

	private static final long serialVersionUID =1L;
	
	@EmbeddedId
	public MEspecificacionesID id;
	@Column(name="cantidad")
	public int cantidad;
	@Column(name="precio")
	public double precio;
	
	public MEspecificaciones() {
	}

	public MEspecificaciones(Especificaciones i) {
		super();
		this.id = new MEspecificaciones (i.id);
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public MEspecificaciones(MEspecificacionesID id, int cantidad, double precio) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public MEspecificacionesID getId() {
		return id;
	}

	public void setId(MEspecificacionesID id) {
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
