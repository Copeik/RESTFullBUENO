package com.copeik.hibernate.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Embeddable
public class EspecificacionesID implements Serializable{

	private static final long serialVersionUID =1L;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="pedido")
	public Pedidos pedido;
	
	@OneToOne   
	@JoinColumn(name = "articulo")
	public Articulos art;
	
	public EspecificacionesID() {

	}
	
	public EspecificacionesID(Pedidos pedido, Articulos art) {
		super();
		this.pedido = pedido;
		this.art = art;
	}
	
	public Pedidos getPedido() {
		return pedido;
	}
	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}
	public Articulos getArt() {
		return art;
	}
	public void setArt(Articulos art) {
		this.art = art;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((art == null) ? 0 : art.hashCode());
		result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EspecificacionesID other = (EspecificacionesID) obj;
		if (art == null) {
			if (other.art != null)
				return false;
		} else if (!art.equals(other.art))
			return false;
		if (pedido == null) {
			if (other.pedido != null)
				return false;
		} else if (!pedido.equals(other.pedido))
			return false;
		return true;
	}
	
	
}
