package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Articulos;
import com.copeik.hibernate.model.MArticulos;

@Component("articuloConvertidor")
public class ArticuloConvertidor {

	public List<MArticulos> convertirLista(List<Articulos> arts){
		List<MArticulos> marticulo = new ArrayList<>();
		
		for(Articulos art : arts) {
			marticulo.add(new MArticulos(art));
		}
		
		return marticulo;
	}
	
}
