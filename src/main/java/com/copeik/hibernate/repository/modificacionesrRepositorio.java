package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.copeik.hibernate.entity.Modificaciones;

public interface modificacionesrRepositorio extends JpaRepository<Modificaciones, Serializable>{
	public abstract Modificaciones findByCodarticulo(int cod_articulo); 

}
