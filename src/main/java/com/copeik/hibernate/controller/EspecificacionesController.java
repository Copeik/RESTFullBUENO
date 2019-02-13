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

import com.copeik.hibernate.converter.EspecificacionesConvertidor;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MEspecificaciones;
import com.copeik.hibernate.repository.EspecificacionesRepositorio;
import com.copeik.hibernate.service.EspecificacionesService;

@RestController
@RequestMapping("/v1")
public class EspecificacionesController {
	
	@Autowired
	@Qualifier("EspecificacionesServicio")
	EspecificacionesService service;
	
	@PutMapping("/especificaciones")
	public boolean Aniadir(@RequestBody @Valid Especificaciones especificaciones) {
		return service.crear(especificaciones);
	}
	
	@PostMapping("/especificaciones")
	public boolean Actualizar(@RequestBody @Valid Especificaciones especificaciones) {
		return service.actualizar(especificaciones);
	}
	
	@DeleteMapping("/especificaciones/{cod_pedido}/{cod_art}")
	public boolean borrar(@PathVariable("cod_pedido") int cod_pedido,@PathVariable("cor_art") int cod_art){
		return service.borrar(cod_pedido,cod_art);
		
	}
	
	@GetMapping("/especificaciones")
	public List<MEspecificaciones> obtenerLista(){
		return service.obtener();
	}
}
