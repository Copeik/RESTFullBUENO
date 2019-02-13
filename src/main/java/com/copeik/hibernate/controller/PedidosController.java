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

import com.copeik.hibernate.converter.PedidosConvertidor;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MPedidos;
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
	
	@PostMapping("/pedidos")
	public boolean Actualizar(@RequestBody @Valid Pedidos pedidos) {
		return service.actualizar(pedidos);
	}
	
	@DeleteMapping("/pedidos/{cod_pedido}")
	public boolean borrar(@PathVariable("cod_pedido") int cod_pedido) {
		return service.borrar(cod_pedido);
		
	}
	
	@GetMapping("/pedidos")
	public List<MPedidos> obtenerLista(){
		return service.obtener();
	}
}
