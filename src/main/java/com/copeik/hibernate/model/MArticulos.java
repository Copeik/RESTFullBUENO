package com.copeik.hibernate.model;

import java.util.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.copeik.hibernate.entity.Articulos;


public class MArticulos {
	
	private static final long serialVersionUID =1L;

	public int cod_articulo;
	public int cantidad;
	public String nombre;
	public String descripcion;
	public double precio_art;
	public MTipo tipo;
	public Date fecha_cad;
	
	public MArticulos() {
		
	}
	public MArticulos(Articulos art) {
		this.cod_articulo = art.codarticulo;
		this.cantidad = art.cantidad;
		this.nombre = art.nombre;
		this.descripcion = art.descripcion;
		this.precio_art = art.precio_art;
		this.tipo = new MTipo(art.tipo);
		this.fecha_cad = art.fecha_cad;
	}
	
	public MArticulos(int cod_articulo, int cantidad, String nombre, String descripcion, double precio_art, MTipo tipo,
			Date fecha_cad) {
		this.cod_articulo = cod_articulo;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_art = precio_art;
		this.tipo = tipo;
		this.fecha_cad = fecha_cad;
	}

	public int getCod_articulo() {
		return cod_articulo;
	}
	public void setCod_articulo(int cod_articulo) {
		this.cod_articulo = cod_articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio_art() {
		return precio_art;
	}
	public void setPrecio_art(double precio_art) {
		this.precio_art = precio_art;
	}
	public MTipo getTipo() {
		return tipo;
	}
	public void setTipo(MTipo tipo) {
		this.tipo = tipo;
	}
	public Date getFecha_cad() {
		return fecha_cad;
	}
	public void setFecha_cad(Date fecha_cad) {
		this.fecha_cad = fecha_cad;
	}

	
	
}
