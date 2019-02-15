package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.entity.Trabajadores;

@Repository("trabajadoresRepositorio")
public interface TrabajadoresRepositorio extends JpaRepository<Trabajadores, Serializable>{
	public abstract List<Trabajadores> findByCodtrabajador(int cod_trab); 
	
	public abstract List<Trabajadores> findAll();

}
