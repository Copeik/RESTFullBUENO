package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Clientes;

import com.copeik.hibernate.model.MClientes;

@Component("clientesConvertidor")
public class ClientesConvertidor {

	/*
	 * Esta clase se encarga de convertir la entidad al modelo
	 */
	public List<MClientes> convertirLista(List<Clientes> arts){
		List<MClientes> mcliente = new ArrayList<>();
		
		for(Clientes art : arts) {
			mcliente.add(new MClientes(art));
		}
		
		return mcliente;
	}
	
}