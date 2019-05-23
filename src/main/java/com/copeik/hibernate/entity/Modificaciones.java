package com.copeik.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name= "Modificaciones") 
@Entity  
public class Modificaciones {
	
	/*
	 * Entidades , pojos de la base de datos
	 */
	
	private static final long serialVersionUID =1L;
	
	@GeneratedValue
	@Id
	@Column(name="codigoModificacion")
	public int codigoModificacion;
	@OneToOne  
	@JoinColumn(name = "codpedido")
	public Pedidos codpedido;
	@Column(name="textoModificacion")
	public String textoModificacion;
	@Column(name="modificado")
	public boolean modificado;
	
	
	public Modificaciones() {
		
	}


	public Modificaciones(int codigoModificacion, Pedidos codpedido, String textoModificacion, boolean modificado) {
		super();
		this.codigoModificacion = codigoModificacion;
		this.codpedido = codpedido;
		this.textoModificacion = textoModificacion;
		this.modificado = modificado;
	}


	public int getCodigoModificacion() {
		return codigoModificacion;
	}


	public void setCodigoModificacion(int codigoModificacion) {
		this.codigoModificacion = codigoModificacion;
	}


	public Pedidos getCodpedido() {
		return codpedido;
	}


	public void setCodpedido(Pedidos codpedido) {
		this.codpedido = codpedido;
	}


	public String getTextoModificacion() {
		return textoModificacion;
	}


	public void setTextoModificacion(String textoModificacion) {
		this.textoModificacion = textoModificacion;
	}


	public boolean getModificado() {
		return modificado;
	}


	public void setModificado(boolean modificado) {
		this.modificado = modificado;
	}
	
	
	
}
