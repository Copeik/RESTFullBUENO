package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.DireccionConvertidor;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.repository.DireccionRepositorio;
import com.copeik.hibernate.service.DireccionService;

@RestController
@RequestMapping("/v1")
public class DireccionController {
	
	@Autowired
	@Qualifier("DireccionServicio")
	DireccionService service;
	
	@PutMapping("/direccion")
	public boolean Aniadir(@RequestBody @Valid Direccion direccion) {
		return service.crear(direccion);
	}
}
