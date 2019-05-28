package com.copeik.hibernate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.service.ArticuloService;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArticulosController {
	
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("ArticuloServicio")
	ArticuloService service;
	
	@PutMapping("/articulo")
	public boolean Actualizar(@RequestBody @Valid Articulos articulo) {
		return service.actualizar(articulo);
	}
	
	@PostMapping("/articulo")
    public boolean Aniadir (@RequestBody @Valid Articulos articulo) throws java.text.ParseException {    
		
		
		return service.crear(articulo);
	}
	
	/*@PostMapping("/articulo")
	public boolean Aniadir(@RequestBody @Valid Articulos articulo) {
		return service.crear(articulo);
	}*/
	//@RequestParam(value="cod_art", required=true) int cod_art
	@PostMapping("/articuloD")
	public boolean borrar(@RequestBody @Valid Articulos articulo) {
		return service.borrar(articulo);
		
	}
	@GetMapping("/articulo1")
	public Articulos obtener(@RequestParam(value="codarticulo", required=true) int codarticulo){
		return service.obtener1(codarticulo);
	}
	@GetMapping("/articulo")
	public List<Articulos> obtenerLista(){
		return service.obtener();
	}
	@GetMapping("/articuloP")
	public List<Articulos> obtenerListaPaginacion(Pageable pageable){
		return service.obtenerPorPaginacion(pageable);
	}
	@GetMapping("/articuloT")
	public List<Articulos> obtenerListaTipo(@RequestParam(value="tipo", required=true) int tipo){
		Tipo a = new Tipo();
		a.setCodigo_t(tipo);
		
		return service.obtenerPorTipo(a);
	}
}
