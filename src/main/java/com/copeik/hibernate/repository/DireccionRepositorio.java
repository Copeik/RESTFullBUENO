package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.copeik.hibernate.entity.Direccion;

@Repository("direccionRepositorio")
public interface DireccionRepositorio extends JpaRepository<Direccion, Serializable>{
	public abstract Direccion findByIddirec(int cod_dir); 
	
	public abstract List<Direccion> findByDirec(String direccion);
	
	public abstract List<Direccion> findAll();

}