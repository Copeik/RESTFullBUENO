package com.copeik.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.entity.Modificaciones;
import com.copeik.hibernate.entity.Pedidos;
import com.copeik.hibernate.repository.DireccionRepositorio;
import com.copeik.hibernate.repository.ModificacionesrRepositorio;

@Service("ModificacionesServicio")
public class ModificacionesService {

	@Autowired
	@Qualifier("modificacionesRepositorio")
	private ModificacionesrRepositorio repositorio;
	
	
	public boolean crear(Modificaciones mod) {
		
			repositorio.save(mod);
			return true;
		
			
		
	}

	public boolean actualizar(Modificaciones mod) {
		repositorio.save(mod);
		return true;
	}
	
	public boolean borrar(int pedido) {
		try {
			Pedidos ped = new Pedidos();
			ped.codpedido=pedido;
			
			List<Modificaciones> modi=repositorio.findByCodpedido(ped);
			for (int i = 0; i < modi.size(); i++) {
				repositorio.delete(modi.get(i));
			}
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public List<Modificaciones> obtener(){
		return repositorio.findAll();
	}
	
	public Modificaciones obtenerPorCodigopedido(Pedidos ped) {
		return repositorio.findByCodpedido(ped).get(0);
	}
}
