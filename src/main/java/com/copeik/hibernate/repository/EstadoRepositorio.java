package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.copeik.hibernate.entity.Estado;

@Repository("estadoRepositorio")
public interface EstadoRepositorio extends JpaRepository<Estado, Serializable>{
	public abstract List<Estado> findAll();
}
