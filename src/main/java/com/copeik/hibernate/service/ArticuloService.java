package com.copeik.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.ArticuloConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.repository.ArticulosRepositorio;

@Service("ArticuloServicio")
public class ArticuloService {

	@Autowired
	@Qualifier("articuloRepositorio")
	private ArticulosRepositorio repositorio;
	
	@Autowired
	@Qualifier("articuloConvertidor")
	private ArticuloConvertidor convertidor;
	
	public boolean crear(Articulos articulo) {
		
			repositorio.save(articulo);
			return true;
		
			
		
	}
	
}
