package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.entity.Direccion;

@Repository("clientesRepositorio")
public interface ClientesRepositorio extends JpaRepository<Clientes, Serializable>{
	public abstract Clientes findByCodcliente(int cod_cliente); 
	
	public abstract List<Clientes> findByNombre(String titulo);
	
	public abstract Clientes findByDir(Direccion dir);
	
	public abstract List<Clientes> findAll();
}
