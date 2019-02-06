package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.TrabajadoresConvertidor;
import com.copeik.hibernate.entity.Trabajadores;
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
	
}
