package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.EspecificacionesRepositorio;

@Service("EspecificacionesServicio")
public class EspecificacionesService {

	@Autowired
	@Qualifier("especificacionesRepositorio")
	private EspecificacionesRepositorio repositorio;

	
	public boolean crear(Especificaciones especificaciones) {
		
			repositorio.save(especificaciones);
			return true;
	}

	public boolean actualizar(Especificaciones especificaciones) {
		repositorio.save(especificaciones);
		return true;
	}
	
	public boolean borrar(Especificaciones especificaciones) {
		try {
			
			repositorio.delete(especificaciones);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Especificaciones> obtener(){
		return repositorio.findAll();
	}
	public List<Especificaciones> obtenerPorCodigo(Pedidos a){
		return repositorio.findPorCodigo(a.codpedido);
	}
}
