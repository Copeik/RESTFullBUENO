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

import com.copeik.hibernate.converter.EspecificacionesConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.EspecificacionesID;
import com.copeik.hibernate.entity.Pedidos;
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
	public boolean Actualizar(@RequestBody @Valid Especificaciones especificaciones) {
		return service.actualizar(especificaciones);
	}
	
	@PostMapping("/especificaciones")
	public boolean Aniadir(@RequestParam(value="cod_pedido", required=true) int cod_pedido,@RequestParam(value="cod_art", required=true) int cod_art,@RequestParam(value="cantidad", required=true) int cantidad,@RequestParam(value="precio", required=true) double pedido) {
		Pedidos ped = new Pedidos();
		Articulos art = new Articulos();
		ped.setCod_pedido(cod_pedido);
		art.setCodarticulo(cod_art);
		
		Especificaciones a = new Especificaciones(new EspecificacionesID(ped,art),cantidad,pedido);
		return service.crear(a);
	}
	
	@PostMapping("/especificacionesBODY")
	public boolean Aniadir2(@RequestBody @Valid Especificaciones especificaciones) {
		return service.crear(especificaciones);
	}
	
	@DeleteMapping("/especificaciones")
	public boolean borrar(@RequestParam(value="cod_pedido", required=true) int cod_pedido,@RequestParam(value="cod_art", required=true) int cod_art){
		return service.borrar(cod_pedido,cod_art);
		
	}
	
	@GetMapping("/especificaciones")
	public List<MEspecificaciones> obtenerLista(){
		return service.obtener();
	}
}
