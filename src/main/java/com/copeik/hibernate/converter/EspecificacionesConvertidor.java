package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.model.MEspecificaciones;

@Component("especificacionesConvertidor")
public class EspecificacionesConvertidor {

	public List<MEspecificaciones> convertirLista(List<Especificaciones> arts){
		List<MEspecificaciones> mespecificaciones = new ArrayList<>();
		
		for(Especificaciones art : arts) {
			mespecificaciones.add(new MEspecificaciones(art));
		}
		
		return mespecificaciones;
	}
	
}