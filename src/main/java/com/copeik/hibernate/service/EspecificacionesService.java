package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.EspecificacionesConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MEspecificaciones;
import com.copeik.hibernate.repository.EspecificacionesRepositorio;

@Service("EspecificacionesServicio")
public class EspecificacionesService {

	@Autowired
	@Qualifier("especificacionesRepositorio")
	private EspecificacionesRepositorio repositorio;
	
	@Autowired
	@Qualifier("especificacionesConvertidor")
	private EspecificacionesConvertidor convertidor;
	
	public boolean crear(Especificaciones especificaciones) {
		
			repositorio.save(especificaciones);
			return true;
	}

	public boolean actualizar(Especificaciones especificaciones) {
		repositorio.save(especificaciones);
		return true;
	}
	
	public boolean borrar(int pedido,int cod_art ) {
		try {
			Especificaciones art = repositorio.findById(pedido, cod_art);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<MEspecificaciones> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
}
