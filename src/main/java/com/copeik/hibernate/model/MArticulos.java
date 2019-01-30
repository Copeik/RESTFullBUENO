package com.copeik.hibernate.model;

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
	public String Nombre;
	public String descripcion;
	public double precio_art;
	public MTipo tipo;
	public LocalDate fecha_cad;
	
	public MArticulos() {
		
	}
	public MArticulos(Articulos art) {
		this.cod_articulo = art.getCodarticulo();
		this.cantidad = art.getCantidad();
		Nombre = art.getNombre();
		this.descripcion = art.getDescripcion();
		this.precio_art = art.getPrecio_art();
		this.tipo = new MTipo(art.getTipo().getCodigo_t(),art.getTipo().getNombre());
		this.fecha_cad = art.getFecha_cad();
	}
	
	public MArticulos(int cod_articulo, int cantidad, String nombre, String descripcion, double precio_art, MTipo tipo,
			LocalDate fecha_cad) {
		this.cod_articulo = cod_articulo;
		this.cantidad = cantidad;
		Nombre = nombre;
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
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
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
	public LocalDate getFecha_cad() {
		return fecha_cad;
	}
	public void setFecha_cad(LocalDate fecha_cad) {
		this.fecha_cad = fecha_cad;
	}

	
	
}
