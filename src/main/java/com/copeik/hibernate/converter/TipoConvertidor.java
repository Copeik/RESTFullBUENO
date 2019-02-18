    package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Tipo;
import com.copeik.hibernate.model.MTipo;

@Component("tipoConvertidor")
public class TipoConvertidor {

	/*
	 * Esta clase se encarga de convertir la entidad al modelo
	 */
	public List<MTipo> convertirLista(List<Tipo> arts){
		List<MTipo> mtipo = new ArrayList<>();
		
		for(Tipo art : arts) {
			mtipo.add(new MTipo(art));
		}
		
		return mtipo;
	}
	
}
