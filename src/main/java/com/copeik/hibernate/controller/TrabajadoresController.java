package com.copeik.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.repository.TrabajadoresRepositorio;
import com.copeik.hibernate.service.TrabajadoresService;

//cON ESTO PERMITIMOS EL CORS
@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/v1")
public class TrabajadoresController {
	
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("TrabajadoresServicio")
	TrabajadoresService service;
	
	/*@PutMapping("/trabajadores")
	public boolean Actualizar(@RequestBody @Valid Trabajadores trabajadores) {
		return service.actualizar(trabajadores);
	}*/
	
	@PutMapping("/trabajadores")
    public boolean Actualizar2 (@RequestParam(value="nombre", required=true) String nombre, 
            @RequestParam(value="contrasena", required=true) String contrasena) {    
		Trabajadores trabajadores = new Trabajadores(nombre, contrasena);
		return service.actualizar(trabajadores);
	}
	
	@PostMapping("/trabajadores")
    public boolean Aniadir2 (@RequestParam(value="nombre", required=true) String nombre, 
            @RequestParam(value="contrasena", required=true) String contrasena) {    
		Trabajadores trabajadores = new Trabajadores(nombre, contrasena);
		return service.crear(trabajadores);
	}
	/*@PostMapping("/trabajadores")
	public boolean Aniadir(@RequestBody @Valid Trabajadores trabajadores) {
		return service.crear(trabajadores);
	}*/
	
	@DeleteMapping("/trabajadores")
	public boolean borrar(@RequestParam(value="cod_trabajador", required=true) int cod_trabajador) {
		return service.borrar(cod_trabajador);
		
	}
	
	@GetMapping("/trabajadores")
	public List<Trabajadores> obtenerLista(){
		return service.obtener();
	}
}
