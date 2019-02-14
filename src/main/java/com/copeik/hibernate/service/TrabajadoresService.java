package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.TrabajadoresConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MPedidos;
import com.copeik.hibernate.model.MTrabajadores;
import com.copeik.hibernate.repository.TrabajadoresRepositorio;

@Service("TrabajadoresServicio")
public class TrabajadoresService {

	@Autowired
	@Qualifier("trabajadoresRepositorio")
	private TrabajadoresRepositorio repositorio;
	
	@Autowired
	@Qualifier("trabajadoresConvertidor")
	private TrabajadoresConvertidor convertidor;
	
	public boolean crear(Trabajadores trabajadores) {
			repositorio.save(trabajadores);
			return true;
		
			
		
	}

	public boolean actualizar(Trabajadores trabajadores) {
		repositorio.save(trabajadores);
		return true;
	}
	
	public boolean borrar(int cod_trabajador) {
		try {
			Trabajadores art = repositorio.findByCodtrabajador(cod_trabajador).get(0);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<MTrabajadores> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	public List<MTrabajadores> obtenerPorNombre(int cod_trabajador){
		return convertidor.convertirLista(repositorio.findByCodtrabajador(cod_trabajador));
	}
	
	
}
