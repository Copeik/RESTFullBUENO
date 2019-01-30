package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;

@Repository("articuloRepositorio")
public interface ArticulosRepositorio extends JpaRepository<Articulos, Serializable>{
	public abstract Articulos findByCodarticulo(int cod_articulo); 
	
	public abstract List<Articulos> findByNombre(String titulo);
	
	public abstract Articulos findByCodarticuloAndNombre(int cod_articulo,String nombre);
}
