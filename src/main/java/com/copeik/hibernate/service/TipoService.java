package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.repository.TipoRepositorio;

@Service("TipoServicio")
public class TipoService {

	@Autowired
	@Qualifier("tipoRepositorio")
	private TipoRepositorio repositorio;
	
	
	public boolean crear(Tipo tipo) {
		
			repositorio.save(tipo);
			return true;
		
			
		
	}

	public boolean actualizar(Tipo tipo) {
		repositorio.save(tipo);
		return true;
	}
	
	public boolean borrar(String nombre ) {
		try {
			Tipo art = repositorio.findByNombre(nombre);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Tipo> obtener(){
		return repositorio.findAll();
	}
	
}
