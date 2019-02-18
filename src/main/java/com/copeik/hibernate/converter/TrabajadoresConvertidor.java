    package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Trabajadores;
import com.copeik.hibernate.model.MTrabajadores;

@Component("trabajadoresConvertidor")
public class TrabajadoresConvertidor {

	/*
	 * Esta clase se encarga de convertir la entidad al modelo
	 */
	public List<MTrabajadores> convertirLista(List<Trabajadores> arts){
		List<MTrabajadores> mtrabajadores = new ArrayList<>();
		
		for(Trabajadores art : arts) {
			mtrabajadores.add(new MTrabajadores(art));
		}
		
		return mtrabajadores;
	}
	
}
