package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Pedidos;

import com.copeik.hibernate.model.MPedidos;

@Component("pedidosConvertidor")
public class PedidosConvertidor {

	/*
	 * Esta clase se encarga de convertir la entidad al modelo
	 */
	public List<MPedidos> convertirLista(List<Pedidos> arts){
		List<MPedidos> mpedidos = new ArrayList<>();
		
		for(Pedidos art : arts) {
			mpedidos.add(new MPedidos(art));
		}
		
		return mpedidos;
	}
	
}