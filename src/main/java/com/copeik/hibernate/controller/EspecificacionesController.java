package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.EspecificacionesConvertidor;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.repository.EspecificacionesRepositorio;
import com.copeik.hibernate.service.EspecificacionesService;

@RestController
@RequestMapping("/v1")
public class EspecificacionesController {
	
	@Autowired
	@Qualifier("EspecificacionesServicio")
	EspecificacionesService service;
	
	@PutMapping("/especificaciones")
	public boolean agregarNota(@RequestBody @Valid Especificaciones especificaciones) {
		return service.crear(especificaciones);
	}
}
