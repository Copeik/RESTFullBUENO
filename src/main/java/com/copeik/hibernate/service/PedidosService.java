package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.PedidosConvertidor;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.PedidosRepositorio;

@Service("PedidosServicio")
public class PedidosService {

	@Autowired
	@Qualifier("pedidosRepositorio")
	private PedidosRepositorio repositorio;
	
	@Autowired
	@Qualifier("pedidosConvertidor")
	private PedidosConvertidor convertidor;
	
	public boolean crear(Pedidos pedidos) {
		
			repositorio.save(pedidos);
			return true;
		
			
		
	}
	
}
