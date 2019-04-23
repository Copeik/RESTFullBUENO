package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Especificaciones;

@Repository("especificacionesRepositorio")
public interface EspecificacionesRepositorio extends JpaRepository<Especificaciones, Serializable>{
	public abstract Especificaciones findById(int pedido,int cod_art); 
	
	public abstract List<Especificaciones> findById(int cod_art);
	
	public abstract Especificaciones findByPrecio(double precio);
	
	
	public abstract List<Especificaciones> findAll();
	
	
}
