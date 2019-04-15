package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;

@Repository("articulosRepositorio")
public interface ArticulosRepositorio extends JpaRepository<Articulos, Serializable>,PagingAndSortingRepository<Articulos, Serializable>{
	public abstract Articulos findByCodarticulo(int cod_articulo); 
	
	public abstract List<Articulos> findByNombre(String titulo);
	
	public abstract List<Articulos> findAll();
	
	public abstract Page<Articulos> findAll(Pageable pageable );
}
