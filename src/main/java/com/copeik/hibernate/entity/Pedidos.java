package com.copeik.hibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity  
@Table(name= "Pedidos") 
public class Pedidos implements Serializable{
	
	/*
	 * Entidades , pojos de la base de datos
	 */
	
	private static final long serialVersionUID =1L;
	
	@GeneratedValue
	@Id
	@Column(name="codpedido")
	public int codpedido;
	@OneToOne   
	@JoinColumn(name="codcliente")
	public Usuario cliente;
	@NotNull(message = "El  no puede ser nulo")
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	public Date fecha;
	@Column(name="entregado")
	public boolean entregado;
	@Column(name="descripcion")
	public String descripcion;
	@Column(name="total")
	public double total;
	@OneToOne  
	@JoinColumn(name = "estado")
	public Estado estado;
	
	public Pedidos() {
	}

	public Pedidos(Usuario cod_cliente, Date fecha,
			boolean entregado, String descripcion, double total) {
		this.cliente = cod_cliente;
		this.fecha = fecha;
		this.entregado = entregado;
		this.descripcion = descripcion;
		this.total = total;
	}

	public int getCodpedido() {
		return codpedido;
	}

	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}

	public Usuario getCliente() {
		return cliente;
	}
	
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCod_cliente(Usuario cod_cliente) {
		this.cliente = cod_cliente;
	}


	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	

}
