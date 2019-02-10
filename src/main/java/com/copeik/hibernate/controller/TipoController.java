package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.TipoConvertidor;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.repository.TipoRepositorio;
import com.copeik.hibernate.service.TipoService;

@RestController
@RequestMapping("/v1")
public class TipoController {
	
	@Autowired
	@Qualifier("TipoServicio")
	TipoService service;
	
	@PutMapping("/tipo")
	public boolean Aniadir(@RequestBody @Valid Tipo tipo) {
		return service.crear(tipo);
	}
}
