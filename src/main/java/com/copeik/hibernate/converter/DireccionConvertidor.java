package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.entity.Direccion;
import com.copeik.hibernate.model.MClientes;
import com.copeik.hibernate.model.MDireccion;

@Component("direccionConvertidor")
public class DireccionConvertidor {

	public List<MDireccion> convertirLista(List<Direccion> arts){
		List<MDireccion> mcliente = new ArrayList<>();
		
		for(Direccion art : arts) {
			mcliente.add(new MDireccion(art));
		}
		
		return mcliente;
	}
	
}