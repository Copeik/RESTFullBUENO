package com.copeik.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.service.EspecificacionesService;

@RestController
@RequestMapping("/v1")
public class EspecificacionesController {
	
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("EspecificacionesServicio")
	EspecificacionesService service;
	
	@PutMapping("/especificaciones")
	public boolean Actualizar(@RequestBody @Valid Especificaciones especificaciones) {
		return service.actualizar(especificaciones);
	}
	
	@PostMapping("/especificaciones")
	public boolean Aniadir(@RequestBody @Valid Especificaciones especificaciones) {
		return service.crear(especificaciones);
	}
	
	@DeleteMapping("/especificaciones")
	public boolean borrar(@RequestParam(value="cod_pedido", required=true) int cod_pedido,@RequestParam(value="cod_art", required=true) int cod_art){
		return service.borrar(cod_pedido,cod_art);
		
	}
	
	@GetMapping("/especificaciones")
	public List<Especificaciones> obtenerLista(){
		return service.obtener();
	}
	
	@GetMapping("/especificacionesPedido")
	public List<Especificaciones> obtenerPorCodPedido(@RequestParam(value="cod_pedido", required=true) int cod_pedido){
		Pedidos a = new Pedidos();
		a.setCodpedido(cod_pedido);
		return service.obtenerPorCodigo(a);
	}
}
