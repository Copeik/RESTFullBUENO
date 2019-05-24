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
import com.copeik.hibernate.entity.Modificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.DireccionRepositorio;
import com.copeik.hibernate.service.DireccionService;
import com.copeik.hibernate.service.ModificacionesService;

@RestController
@RequestMapping("/v1")
public class ModificacionesController {
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	@Autowired
	@Qualifier("ModificacionesServicio")
	ModificacionesService service;
	
	@PutMapping("/modificaciones")
	public boolean Actualizar(@RequestBody @Valid Modificaciones mod) {
		return service.actualizar(mod);
	}
	
	@PostMapping("/modificaciones")
	public boolean Aniadir(@RequestBody @Valid Modificaciones mod) {
		return service.crear(mod);
	}
	
	@DeleteMapping("/modificaciones")
	public boolean Modificaciones(@RequestBody @Valid Modificaciones mod) {
		return service.borrar(mod);
		
	}
	
	@GetMapping("/modificacionesP")
	public Modificaciones ObtenerPedido(@RequestParam(value="codigopedido", required=true) int codigopedido){
		Pedidos ped = new Pedidos();
		ped.codpedido=codigopedido;
		return service.obtenerPorCodigopedido(ped);
	}
	
	@GetMapping("/modificaciones")
	public List<Modificaciones> obtenerLista(){
		return service.obtener();
	}
}
