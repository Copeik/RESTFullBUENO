package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Tipo;

@Repository("articulosRepositorio")
public interface ArticulosRepositorio extends JpaRepository<Articulos, Serializable>,PagingAndSortingRepository<Articulos, Serializable>{
	public abstract Articulos findByCodarticulo(int cod_articulo); 
	
	@Query(" Select a from Articulos a where codigo_tipo = :codigo_t")
	public abstract List<Articulos> findPorCodigo(@Param("codigo_t") Tipo codigo_t);
	
	public abstract List<Articulos> findByNombre(String titulo);
	
	public abstract List<Articulos> findAll();
	
	public abstract Page<Articulos> findAll(Pageable pageable );
}
