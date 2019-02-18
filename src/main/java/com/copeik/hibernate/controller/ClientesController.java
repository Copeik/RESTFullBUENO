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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.converter.ClientesConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MClientes;
import com.copeik.hibernate.repository.ClientesRepositorio;
import com.copeik.hibernate.service.ClientesService;

@RestController
@RequestMapping("/v1")
public class ClientesController {
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("ClientesServicio")
	ClientesService service;
	
	@PutMapping("/clientes")
	public boolean Actualizar(@RequestBody @Valid Clientes clientes) {
		return service.actualizar(clientes);
	}
	
	@PostMapping("/clientes")
	public boolean Aniadir(@RequestBody @Valid Clientes clientes) {
		return service.crear(clientes);
	}
	
	@DeleteMapping("/clientes")
	public boolean borrar(@RequestParam(value="cod_cliente", required=true) int cod_cliente) {
		return service.borrar(cod_cliente);
		
	}
	
	@GetMapping("/clientes")
	public List<MClientes> obtenerLista(){
		return service.obtener();
	}
}
