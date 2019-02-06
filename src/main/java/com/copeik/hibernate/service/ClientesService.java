package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.ClientesConvertidor;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.repository.ClientesRepositorio;

@Service("ClientesServicio")
public class ClientesService {

	@Autowired
	@Qualifier("clientesRepositorio")
	private ClientesRepositorio repositorio;
	
	@Autowired
	@Qualifier("clientesConvertidor")
	private ClientesConvertidor convertidor;
	
	public boolean crear(Clientes cliente) {
		
			repositorio.save(cliente);
			return true;
		
			
		
	}
	
}
