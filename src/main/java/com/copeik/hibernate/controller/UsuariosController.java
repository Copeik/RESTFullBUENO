package com.copeik.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.entity.Usuario;
import com.copeik.hibernate.model.MTrabajadores;
import com.copeik.hibernate.service.TrabajadoresService;
import com.copeik.hibernate.service.UsuarioService;

@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/v1")
public class UsuariosController {

	
	/*
	 * Esta clase controla las acciones con la base de datos
	 */
	
	@Autowired
	@Qualifier("usuarioService")
	UsuarioService service;
	
	/*@PutMapping("/trabajadores")
	public boolean Actualizar(@RequestBody @Valid Trabajadores trabajadores) {
		return service.actualizar(trabajadores);
	}*/
	
	@PutMapping("/usuario")
    public boolean Actualizar2 (@RequestParam(value="nombre", required=true) String nombre, 
            @RequestParam(value="contrasena", required=true) String contrasena) {    
		Usuario usuario = new Usuario(nombre, contrasena, (byte) 1, true);
		return service.actualizar(usuario);
	}
	
	@PostMapping("/usuario")
    public boolean Aniadir2 (@RequestParam(value="nombre", required=true) String nombre, 
            @RequestParam(value="contrasena", required=true) String contrasena) {    
		Usuario usuario = new Usuario(nombre, contrasena, (byte) 1, true);
		return service.crear(usuario);
	}
	/*@PostMapping("/trabajadores")
	public boolean Aniadir(@RequestBody @Valid Trabajadores trabajadores) {
		return service.crear(trabajadores);
	}*/
	
	@DeleteMapping("/usuario")
	public boolean borrar(@RequestParam(value="cod_trabajador", required=true) String cod_trabajador) {
		return service.borrar(cod_trabajador);
		
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> obtenerLista(){
		return service.obtener();
	}
	@GetMapping("/usuario")
	public Usuario obtener(@RequestParam(value="nombre", required=true) String nombre){
		return service.obtenerPorNombre(nombre);
	}
}
