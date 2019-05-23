package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Modificaciones;
import com.copeik.hibernate.entity.Pedidos;

@Repository("modificacionesRepositorio")
public interface ModificacionesrRepositorio extends JpaRepository<Modificaciones, Serializable>{
	public abstract List<Modificaciones> findAll(); 

}
