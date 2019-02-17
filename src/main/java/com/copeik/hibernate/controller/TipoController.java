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

import com.copeik.hibernate.converter.TipoConvertidor;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MTipo;
import com.copeik.hibernate.repository.TipoRepositorio;
import com.copeik.hibernate.service.TipoService;

@RestController
@RequestMapping("/v1")
public class TipoController {
	
	@Autowired
	@Qualifier("TipoServicio")
	TipoService service;
	
	@PutMapping("/tipo")
	public boolean Actualizar(@RequestBody @Valid Tipo tipo) {
		return service.actualizar(tipo);
	}
	
	@PostMapping("/tipo")
	public boolean Aniadir(@RequestBody @Valid Tipo tipo) {
		return service.crear(tipo);
	}
	
	@DeleteMapping("/tipo")
	public boolean borrar(@RequestParam(value="nombre", required=true) String nombre) {
		return service.borrar(nombre);
		
	}
	
	@GetMapping("/tipo")
	public List<MTipo> obtenerLista(){
		return service.obtener();
	}
}
