package com.copeik.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Tipo;
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
	public boolean borrar(Articulos art ) {
		try {
			repositorio.delete(art);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Articulos> obtener(){
		return repositorio.findAll();
	}
	public Articulos obtener1(int cod_articulo){
		return repositorio.findByCodarticulo(cod_articulo);
	}
	public List<Articulos> obtenerPorPaginacion(Pageable pageable){
		return repositorio.findAll(pageable).getContent();
	}
	
	public List<Articulos> obtenerPorNombre(String titulo){
		return repositorio.findByNombre(titulo);
	}
	public List<Articulos> obtenerPorTipo(Tipo tipo){
		return repositorio.findPorCodigo(tipo);
	}
}
