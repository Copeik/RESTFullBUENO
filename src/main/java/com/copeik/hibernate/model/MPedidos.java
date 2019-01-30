package com.copeik.hibernate.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


public class MPedidos implements Serializable{
	
	private static final long serialVersionUID =1L;
	

	public int cod_pedido;

	public MClientes cod_cliente;

	public LocalDate fecha;

	public boolean entregado;

	public String descripcion;

	public double total;

	public MTrabajadores cod_trab;
	
	public MPedidos() {
	}
	
	

	public MPedidos(int cod_pedido, MClientes cod_cliente, LocalDate fecha,
			boolean entregado, String descripcion, double total, MTrabajadores cod_trab) {
		super();
		this.cod_pedido = cod_pedido;
		this.cod_cliente = cod_cliente;
		this.fecha = fecha;
		this.entregado = entregado;
		this.descripcion = descripcion;
		this.total = total;
		this.cod_trab = cod_trab;
	}




	public MTrabajadores getCod_trab() {
		return cod_trab;
	}



	public void setCod_trab(MTrabajadores cod_trab) {
		this.cod_trab = cod_trab;
	}



	public int getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(int cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public MClientes getCod_cliente() {
		return cod_cliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setCod_cliente(MClientes cod_cliente) {
		this.cod_cliente = cod_cliente;
	}


	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
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
