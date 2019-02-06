package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.TipoConvertidor;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.repository.TipoRepositorio;

@Service("TipoServicio")
public class TipoService {

	@Autowired
	@Qualifier("tipoRepositorio")
	private TipoRepositorio repositorio;
	
	@Autowired
	@Qualifier("tipoConvertidor")
	private TipoConvertidor convertidor;
	
	public boolean crear(Tipo tipo) {
		
			repositorio.save(tipo);
			return true;
		
			
		
	}
	
}
