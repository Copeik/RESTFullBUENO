package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.ClientesConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MClientes;
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

	public boolean actualizar(Clientes cliente) {
		repositorio.save(cliente);
		return false;
	}
	
	public boolean borrar(int cod_cliente ) {
		try {
			Clientes art = repositorio.findByCodcliente(cod_cliente).get(0);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<MClientes> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	public List<MClientes> obtenerPorNombre(int cod_cliente){
		return convertidor.convertirLista(repositorio.findByCodcliente(cod_cliente));
	}
	
}
