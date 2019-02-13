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

import com.copeik.hibernate.converter.DireccionConvertidor;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MDireccion;
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
	
	@PostMapping("/direccion")
	public boolean Actualizar(@RequestBody @Valid Direccion direccion) {
		return service.actualizar(direccion);
	}
	
	@DeleteMapping("/direccion/{cod_art}")
	public boolean borrar(@PathVariable("cor_art") int cod_art) {
		return service.borrar(cod_art);
		
	}
	
	@GetMapping("/direccion")
	public List<MDireccion> obtenerLista(){
		return service.obtener();
	}
}
