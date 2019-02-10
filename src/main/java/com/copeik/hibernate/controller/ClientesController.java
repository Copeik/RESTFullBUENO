package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.ClientesConvertidor;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.repository.ClientesRepositorio;
import com.copeik.hibernate.service.ClientesService;

@RestController
@RequestMapping("/v1")
public class ClientesController {
	
	@Autowired
	@Qualifier("ClientesServicio")
	ClientesService service;
	
	@PutMapping("/clientes")
	public boolean Aniadir(@RequestBody @Valid Clientes clientes) {
		return service.crear(clientes);
	}
}
