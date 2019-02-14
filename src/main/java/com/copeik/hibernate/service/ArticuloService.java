package com.copeik.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.copeik.hibernate.converter.ArticuloConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.model.*;
import com.copeik.hibernate.repository.ArticulosRepositorio;



@Service("ArticuloServicio")
public class ArticuloService {

	@Autowired
	@Qualifier("articulosRepositorio")
	private ArticulosRepositorio repositorio;
	
	@Autowired
	@Qualifier("articulosConvertidor")
	private ArticuloConvertidor convertidor;
	
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
	
	public List<MArticulos> obtener(){
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	public List<MArticulos> obtenerPorNombre(String titulo){
		return convertidor.convertirLista(repositorio.findByNombre(titulo));
	}
	
}
