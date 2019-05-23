package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.entity.Modificaciones;
import com.copeik.hibernate.repository.DireccionRepositorio;
import com.copeik.hibernate.repository.ModificacionesrRepositorio;

@Service("ModificacionesServicio")
public class ModificacionesService {

	@Autowired
	@Qualifier("modificacionesRepositorio")
	private ModificacionesrRepositorio repositorio;
	
	
	public boolean crear(Modificaciones mod) {
		
			repositorio.save(mod);
			return true;
		
			
		
	}

	public boolean actualizar(Modificaciones mod) {
		repositorio.save(mod);
		return true;
	}
	
	public boolean borrar(Modificaciones mod ) {
		try {
			repositorio.delete(mod);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Modificaciones> obtener(){
		return repositorio.findAll();
	}
}
