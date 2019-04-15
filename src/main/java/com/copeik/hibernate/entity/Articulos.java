package com.copeik.hibernate.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Table(name= "Articulos") 
@Entity  
public class Articulos implements Serializable{
	
	/*
	 * Entidades , pojos de la base de datos
	 */
	
	private static final long serialVersionUID =1L;
	
	@GeneratedValue
	@Id
	@Column(name="codarticulo")
	public int codarticulo;
	@Column(name="cantidad")
	public int cantidad;
	@Column(name="nombre")
	public String nombre;
	@Column(name="descripcion")
	public String descripcion;
	@Column(name="precio_articulo")
	public double precio_articulo;
	@ManyToOne()  
	@JoinColumn(name = "codigo_tipo")
	@NotNull(message = "El tipo no puede ser nulo")
	public Tipo codigo_tipo;
	@Column(name="fecha_caducidad")
	public String fecha_caducidad;
	
	

	public Articulos() {
		
	}

	public Articulos(int cantidad, String nombre, String descripcion, double precio_art, Tipo codigo_tipo,
			String fecha_caducidad) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_articulo = precio_art;
		this.codigo_tipo = codigo_tipo;
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getCodarticulo() {
		return codarticulo;
	}

	public void setCodarticulo(int codarticulo) {
		this.codarticulo = codarticulo;
	}

	public Tipo getTipo() {
		return codigo_tipo;
	}

	public void setTipo(Tipo codigo_tipo) {
		this.codigo_tipo = codigo_tipo;
	}

	public String getFecha_cad() {
		return fecha_caducidad;
	}

	public void setFecha_cad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
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
		return precio_articulo;
	}
	public void setPrecio_art(double precio_articulo) {
		this.precio_articulo = precio_articulo;
	}

	
	
}
