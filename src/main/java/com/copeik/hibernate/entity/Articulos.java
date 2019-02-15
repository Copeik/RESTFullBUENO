package com.copeik.hibernate.entity;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Table(name= "Articulos") 
@Entity  
public class Articulos implements Serializable{
	
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
	@Column(name="precio_art")
	public double precio_art;
	@ManyToOne(fetch = FetchType.LAZY)  
	@JoinColumn(name = "codigo_t")
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@NotNull(message = "El tipo no puede ser nulo")
	public Tipo tipo;
	@NotNull(message = "El  no puede ser nulo")
	@Column(name="fecha_cad")
	@Temporal(TemporalType.DATE)
	public Date fecha_cad;
	
	

	public Articulos() {
		
	}

	public Articulos(int cantidad, String nombre, String descripcion, double precio_art, Tipo tipo,
			Date fecha_cad) {
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio_art = precio_art;
		this.tipo = tipo;
		this.fecha_cad = fecha_cad;
	}

	public int getCodarticulo() {
		return codarticulo;
	}

	public void setCodarticulo(int codarticulo) {
		this.codarticulo = codarticulo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Date getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(Date fecha_cad) {
		this.fecha_cad = fecha_cad;
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
		return precio_art;
	}
	public void setPrecio_art(double precio_art) {
		this.precio_art = precio_art;
	}

	
	
}
