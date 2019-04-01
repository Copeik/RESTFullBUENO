package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.repository.TrabajadoresRepositorio;

@Service("TrabajadoresServicio")
public class TrabajadoresService {

	@Autowired
	@Qualifier("trabajadoresRepositorio")
	private TrabajadoresRepositorio repositorio;
	
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
	
	public List<Trabajadores> obtener(){
		return repositorio.findAll();
	}
	
	public List<Trabajadores> obtenerPorNombre(int cod_trabajador){
		return repositorio.findByCodtrabajador(cod_trabajador);
	}
	
	
}
