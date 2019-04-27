package com.copeik.hibernate.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.entity.Usuario;
import com.copeik.hibernate.service.PedidosService;

@RestController
@RequestMapping("/v1")
public class PedidosController {
	
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("PedidosServicio")
	PedidosService service;
	
	@PutMapping("/pedidos")
	public boolean Actualizar(@RequestBody @Valid Pedidos pedidos) {
		return service.actualizar(pedidos);
	}

	@PostMapping("/pedidos")
	public boolean Aniadir(@RequestBody @Valid Pedidos pedidos) {
		return service.crear(pedidos);
	}
	
	@DeleteMapping("/pedidos")
	public boolean borrar(@RequestParam(value="cod_pedido", required=true) int cod_pedido) {
		return service.borrar(cod_pedido);
		
	}
	
	@GetMapping("/pedidos")
	public List<Pedidos> obtenerLista(){
		return service.obtener();
	}
	@GetMapping("/pedidoscliente")
	public List<Pedidos> obtenerLista(@RequestParam(value="cod_cliente", required=true) int cod_cliente){
		Usuario ur= new Usuario();
		ur.setId(cod_cliente);
		return service.obtenerporcliente(ur);
	}
	@GetMapping("/pedido")
	public List<Pedidos> obtenerPedido(@RequestParam(value="cod_pedido", required=true) int cod_pedido){
		return service.obtenerPorCodigoPedido(cod_pedido);
	}
	@GetMapping("/pedidoslast")
	public Pedidos obtenerultimo(){
		return service.obtenerUltimo();
	}
}
