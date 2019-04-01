package com.copeik.hibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.copeik.hibernate.entity.Usuario;
import com.copeik.hibernate.service.UsuarioService;

@CrossOrigin(origins="*",methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
@RestController
@RequestMapping("/v1")
public class UsuariosController {

	@Autowired
	@Qualifier("usuarioService")
	UsuarioService service;
	
	/*@PutMapping("/trabajadores")
	public boolean Actualizar(@RequestBody @Valid Trabajadores trabajadores) {
		return service.actualizar(trabajadores);
	}*/
	
	@PutMapping("/usuario")
    public boolean Actualizar (@RequestBody @Valid Usuario cliente) {  
		return service.actualizar(cliente);
	}
	
	@PostMapping("/usuario")
    public boolean Aniadir (@RequestBody @Valid Usuario cliente) {  
		return service.actualizar(cliente);
	}
	/*@PostMapping("/trabajadores")
	public boolean Aniadir(@RequestBody @Valid Trabajadores trabajadores) {
		return service.crear(trabajadores);
		
	}*/
	
	@DeleteMapping("/usuario")
	public boolean borrar(@RequestBody @Valid Usuario cliente) {
		return service.borrar(cliente.getId());
		
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
