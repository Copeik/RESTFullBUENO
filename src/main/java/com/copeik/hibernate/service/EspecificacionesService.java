package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.EspecificacionesConvertidor;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.repository.EspecificacionesRepositorio;

@Service("EspecificacionesServicio")
public class EspecificacionesService {

	@Autowired
	@Qualifier("EspecificacionesRepositorio")
	private EspecificacionesRepositorio repositorio;
	
	@Autowired
	@Qualifier("EspecificacionesConvertidor")
	private EspecificacionesConvertidor convertidor;
	
	public boolean crear(Especificaciones especificaciones) {
		
			repositorio.save(especificaciones);
			return true;
		
			
		
	}
	
}
