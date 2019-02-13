package com.copeik.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.ArticuloConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.repository.ArticulosRepositorio;
import com.copeik.hibernate.service.ArticuloService;

@RestController
@RequestMapping("/v1")
public class ArticulosController {
	
	@Autowired
	@Qualifier("ArticuloServicio")
	ArticuloService service;
	
	@PutMapping("/articulo")
	public boolean Aniadir(@RequestBody @Valid Articulos articulo) {
		return service.crear(articulo);
	}
	
	@PostMapping("/articulo")
	public boolean Actualizar(@RequestBody @Valid Articulos articulo) {
		return service.actualizar(articulo);
	}
	
	@DeleteMapping("/articulo/{cod_art}")
	public boolean borrar(@PathVariable("cor_art") int cod_art) {
		return service.borrar(cod_art);
		
	}
	@GetMapping("/articulo")
	public List<MArticulos> obtenerLista(){
		return service.obtener();
	}
	
}
