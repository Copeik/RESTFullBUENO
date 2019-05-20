package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.entity.Usuario;
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
	
	public boolean borrar(Pedidos cod_pedido) {
		try {
			repositorio.delete(cod_pedido);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public List<Pedidos> obtenerporcliente(Usuario cod_cliente){
		return repositorio.findByCliente(cod_cliente);
	}
	
	public List<Pedidos> obtener(){
		return repositorio.findAll();
	}
	public Pedidos obtenerUltimo(){
		return repositorio.findpedlast().get(0);
	}
	
	public List<Pedidos> obtenerPorCodigoPedido(int cod_pedido){
		return repositorio.findByCodpedido(cod_pedido);
	}

	
}
