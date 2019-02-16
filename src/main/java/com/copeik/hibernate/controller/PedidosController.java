package com.copeik.hibernate.controller;

import java.text.ParseException;
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

import com.copeik.hibernate.converter.PedidosConvertidor;
import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.model.MArticulos;
import com.copeik.hibernate.model.MPedidos;
import com.copeik.hibernate.repository.PedidosRepositorio;
import com.copeik.hibernate.service.PedidosService;

@RestController
@RequestMapping("/v1")
public class PedidosController {
	
	@Autowired
	@Qualifier("PedidosServicio")
	PedidosService service;
	
	@PutMapping("/pedidos")
	public boolean Aniadir(@RequestBody @Valid Pedidos pedidos) {
		return service.crear(pedidos);
	}
	
	@PostMapping("/pedidos")
		    public boolean Aniadir2 (@RequestParam(value="cliente", required=true) int cliente, 
		            @RequestParam(value="fecha", required=true) String fecha,@RequestParam(value="entregado", required=true) boolean entregado, 
		            @RequestParam(value="descripcion", required=true) String descripcion,@RequestParam(value="total", required=true) double total,@RequestParam(value="codtrabajador", required=true) int codtrabajador) throws ParseException {
		Clientes a = new Clientes();
		a.setCod_cliente(cliente);
		Trabajadores tra = new Trabajadores();
		tra.setCod_trabajador(codtrabajador);
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha_cad2 = null;
		fecha_cad2 = formatoDelTexto.parse(fecha);
		    	Pedidos pedidos = new Pedidos(a,fecha_cad2,entregado,descripcion,total,tra);
		    	return service.actualizar(pedidos);
	
	}
	//@PostMapping("/pedidos")
	//public boolean Actualizar(@RequestBody @Valid Pedidos pedidos) {
	//	return service.actualizar(pedidos);
	//}
	
	@DeleteMapping("/pedidos")
	public boolean borrar(@RequestParam(value="cod_pedido", required=true) int cod_pedido) {
		return service.borrar(cod_pedido);
		
	}
	
	@GetMapping("/pedidos")
	public List<MPedidos> obtenerLista(){
		return service.obtener();
	}
}
