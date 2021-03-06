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
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.repository.DireccionRepositorio;
import com.copeik.hibernate.service.DireccionService;

@RestController
@RequestMapping("/v1")
public class DireccionController {
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	@Autowired
	@Qualifier("DireccionServicio")
	DireccionService service;
	
	@PutMapping("/direccion")
	public boolean Actualizar(@RequestBody @Valid Direccion direccion) {
		return service.actualizar(direccion);
	}
	
	@PostMapping("/direccion")
	public boolean Aniadir(@RequestBody @Valid Direccion direccion) {
		return service.crear(direccion);
	}
	
	@DeleteMapping("/direccion")
	public boolean borrar(@RequestParam(value="cod_dir", required=true) int cod_dir) {
		return service.borrar(cod_dir);
		
	}
	
	@GetMapping("/direccion")
	public List<Direccion> obtenerLista(){
		return service.obtener();
	}
}
