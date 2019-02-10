package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.ArticuloConvertidor;
import com.copeik.hibernate.entity.Articulos;
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
}
