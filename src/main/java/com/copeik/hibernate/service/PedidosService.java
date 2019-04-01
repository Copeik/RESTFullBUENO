package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.PedidosRepositorio;

@Service("PedidosServicio")
public class PedidosService {

	@Autowired
	@Qualifier("pedidosRepositorio")
	private PedidosRepositorio repositorio;
	
	public boolean crear(Pedidos pedidos) {
		
			repositorio.save(pedidos);
			return true;
		
			
		
	}

	public boolean actualizar(Pedidos pedidos) {
		repositorio.save(pedidos);
		return true;
	}
	
	public boolean borrar(int cod_pedido) {
		try {
			Pedidos art = repositorio.findByCodpedido(cod_pedido).get(0);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Pedidos> obtener(){
		return repositorio.findAll();
	}
	
	public List<Pedidos> obtenerPorNombre(int cod_cliente){
		return repositorio.findByCodpedido(cod_cliente);
	}

	
}
