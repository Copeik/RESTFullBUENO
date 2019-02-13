package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.entity.Tipo;

@Repository("tipoRepositorio")
public interface TipoRepositorio extends JpaRepository<Tipo, Serializable>{
	public abstract Tipo findByNombre(String nombre); 
	
	public abstract List<Tipo> findAll();
}
