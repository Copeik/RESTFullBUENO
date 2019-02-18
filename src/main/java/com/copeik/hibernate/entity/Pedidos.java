package com.copeik.hibernate.entity;

import java.io.Serializable;
import java.util.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	public Clientes cliente;
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
	@JoinColumn(name = "cod_trabajador")
	public Trabajadores cod_trab;
	
	public Pedidos() {
	}
	
	

	public Pedidos(Clientes cod_cliente, Date fecha,
			boolean entregado, String descripcion, double total, Trabajadores cod_trab) {
		this.cliente = cod_cliente;
		this.fecha = fecha;
		this.entregado = entregado;
		this.descripcion = descripcion;
		this.total = total;
		this.cod_trab = cod_trab;
	}




	public Trabajadores getCod_trab() {
		return cod_trab;
	}



	public void setCod_trab(Trabajadores cod_trab) {
		this.cod_trab = cod_trab;
	}



	public int getCod_pedido() {
		return codpedido;
	}

	public void setCod_pedido(int cod_pedido) {
		this.codpedido = cod_pedido;
	}

	public Clientes getCod_cliente() {
		return cliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCod_cliente(Clientes cod_cliente) {
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
