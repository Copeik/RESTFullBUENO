package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.DireccionConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MDireccion;
import com.copeik.hibernate.repository.DireccionRepositorio;

@Service("DireccionServicio")
public class DireccionService {

	@Autowired
	@Qualifier("direccionRepositorio")
	private DireccionRepositorio repositorio;
	
	@Autowired
	@Qualifier("direccionConvertidor")
	private DireccionConvertidor convertidor;
	
	public boolean crear(Direccion direccion) {
		
			repositorio.save(direccion);
			return true;
		
			
		
	}

	public boolean actualizar(Direccion direccion) {
		repositorio.save(direccion);
		return true;
	}
	
	public boolean borrar(int cod_dir ) {
		try {
			Direccion art = repositorio.findByIddirec(cod_dir);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<MDireccion> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
}
