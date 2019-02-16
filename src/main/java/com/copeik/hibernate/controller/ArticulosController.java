package com.copeik.hibernate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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

import com.copeik.hibernate.converter.ArticuloConvertidor;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.repository.ArticulosRepositorio;
import com.copeik.hibernate.service.ArticuloService;

import groovyjarjarcommonscli.ParseException;

@RestController
@RequestMapping("/v1")
public class ArticulosController {
	
	@Autowired
	@Qualifier("ArticuloServicio")
	ArticuloService service;
	
	@PutMapping("/articuloBODY")
	public boolean Actualizar(@RequestBody @Valid Articulos articulo) {
		return service.crear(articulo);
	}
	@PutMapping("/articulo")
    public boolean Actualizar2 (@RequestParam(value="codarticulo", required=true) int codarticulo,@RequestParam(value="cantidad", required=true) int cantidad, 
            @RequestParam(value="nombre", required=true) String nombre,@RequestParam(value="descripcion", required=true) String descripcion, 
            @RequestParam(value="precio_art", required=true) double precio_art,@RequestParam(value="codigo_t", required=true) int codigo_t,@RequestParam(value="fecha_cad", required=true) Date fecha_cad) {    
		String nombre_t = null;
		if (codigo_t ==1) {
			 nombre_t = "Plantas";
		}else {
			 nombre_t = "No plantas";
		}
		Articulos art = new Articulos(cantidad, nombre , descripcion , precio_art ,new Tipo(codigo_t,nombre_t),fecha_cad );
		art.setCodarticulo(codarticulo);
		return service.crear(art);
	}
	@PostMapping("/articulo")
    public boolean Aniadir2 (@RequestParam(value="cantidad", required=true) int cantidad, 
            @RequestParam(value="nombre", required=true) String nombre,@RequestParam(value="descripcion", required=true) String descripcion, 
            @RequestParam(value="precio_art", required=true) double precio_art,@RequestParam(value="codigo_t", required=true) int codigo_t,@RequestParam(value="fecha_cad", required=true) String fecha_cad) throws java.text.ParseException {    
		String nombre_t = null;
		if (codigo_t ==1) {
			 nombre_t = "Plantas";
		}else {
			 nombre_t = "No plantas";
		}
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		;
		Date fecha_cad2 = null;
		fecha_cad2 = formatoDelTexto.parse(fecha_cad);
		Articulos art = new Articulos(cantidad, nombre , descripcion , precio_art ,new Tipo(codigo_t,nombre_t),fecha_cad2 );
		return service.actualizar(art);
	}
	
	/*@PostMapping("/articulo")
	public boolean Aniadir(@RequestBody @Valid Articulos articulo) {
		return service.actualizar(articulo);
	}*/
	
	@DeleteMapping("/articulo")
	public boolean borrar(@RequestParam(value="cod_art", required=true) int cod_art) {
		return service.borrar(cod_art);
		
	}
	@GetMapping("/articulo")
	public List<MArticulos> obtenerLista(){
		return service.obtener();
	}
	
}
