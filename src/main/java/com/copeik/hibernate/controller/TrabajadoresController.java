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

import com.copeik.hibernate.converter.TrabajadoresConvertidor;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MTrabajadores;
import com.copeik.hibernate.repository.TrabajadoresRepositorio;
import com.copeik.hibernate.service.TrabajadoresService;

@RestController
@RequestMapping("/v1")
public class TrabajadoresController {
	
	@Autowired
	@Qualifier("TrabajadoresServicio")
	TrabajadoresService service;
	
	@PutMapping("/trabajadores")
	public boolean Aniadir(@RequestBody @Valid Trabajadores trabajadores) {
		return service.crear(trabajadores);
	}
	
	@PostMapping("/trabajadores")
	public boolean Actualizar(@RequestBody @Valid Trabajadores trabajadores) {
		return service.actualizar(trabajadores);
	}
	
	@DeleteMapping("/trabajadores/{cod_trabajador}")
	public boolean borrar(@PathVariable("cod_trabajador") int cod_trabajador) {
		return service.borrar(cod_trabajador);
		
	}
	
	@GetMapping("/trabajadores")
	public List<MTrabajadores> obtenerLista(){
		return service.obtener();
	}
}
