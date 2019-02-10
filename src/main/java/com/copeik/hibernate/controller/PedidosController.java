package com.copeik.hibernate.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.PedidosConvertidor;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.PedidosRepositorio;
import com.copeik.hibernate.service.PedidosService;

@RestController
@RequestMapping("/v1")
public class PedidosController {
	
	@Autowired
	@Qualifier("PedidosServicio")
	PedidosService service;
	
	@PutMapping("/pedidos")
	public boolean Aniadir(@RequestBody @Valid Pedidos pedidos) {
		return service.crear(pedidos);
	}
}
