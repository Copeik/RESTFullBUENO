package com.copeik.hibernate.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Pedidos;

@Repository("pedidosRepositorio")
public interface PedidosRepositorio extends JpaRepository<Pedidos, Serializable>{
	public abstract List<Pedidos> findByCodpedido(int codcliente); 
	
	public abstract List<Pedidos> findByCodcliente(String titulo);
	
	public abstract List<Pedidos> findByEntregado(boolean pedido);
	
	public abstract List<Pedidos> findAll();
}
