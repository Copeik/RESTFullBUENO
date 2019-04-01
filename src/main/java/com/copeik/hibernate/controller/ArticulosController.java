package com.copeik.hibernate.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.service.ArticuloService;

@RestController
@RequestMapping("/v1")
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
		
		
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha_cad2 = null;
		fecha_cad2 = formatoDelTexto.parse(articulo.fecha_caducidad.toString());
		Articulos art = new Articulos(articulo.cantidad, articulo.nombre , articulo.descripcion , articulo.precio_articulo ,articulo.codigo_tipo,fecha_cad2 );
		return service.crear(art);
	}
	
	/*@PostMapping("/articulo")
	public boolean Aniadir(@RequestBody @Valid Articulos articulo) {
		return service.crear(articulo);
	}*/
	
	@DeleteMapping("/articulo")
	public boolean borrar(@RequestParam(value="cod_art", required=true) int cod_art) {
		return service.borrar(cod_art);
		
	}
	@GetMapping("/articulo")
	public List<Articulos> obtenerLista(){
		return service.obtener();
	}
	
}
