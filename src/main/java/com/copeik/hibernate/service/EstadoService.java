package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Estado;
import com.copeik.hibernate.repository.EstadoRepositorio;



@Service("EstadoServicio")
public class EstadoService {

	@Autowired
	@Qualifier("estadoRepositorio")
	private EstadoRepositorio repositorio;
	
	public boolean crear(Estado articulo) {
			repositorio.save(articulo);
			return true;
		
			
		
	}
	public boolean actualizar(Estado articulo) {
		
		repositorio.save(articulo);
		return true;
	
}

	
	public List<Estado> obtener(){
		return repositorio.findAll();
	}
	
	
}
