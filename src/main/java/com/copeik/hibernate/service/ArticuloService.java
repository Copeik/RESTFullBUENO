package com.copeik.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.repository.ArticulosRepositorio;



@Service("ArticuloServicio")
public class ArticuloService {

	@Autowired
	@Qualifier("articulosRepositorio")
	private ArticulosRepositorio repositorio;
	
	public boolean crear(Articulos articulo) {
			repositorio.save(articulo);
			return true;
		
			
		
	}
	public boolean actualizar(Articulos articulo) {
		
		repositorio.save(articulo);
		return true;
	
}
	public boolean borrar(int cod_art ) {
		try {
			Articulos art = repositorio.findByCodarticulo(cod_art);
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Articulos> obtener(){
		return repositorio.findAll();
	}
	
	public List<Articulos> obtenerPorNombre(String titulo){
		return repositorio.findByNombre(titulo);
	}
	
}
