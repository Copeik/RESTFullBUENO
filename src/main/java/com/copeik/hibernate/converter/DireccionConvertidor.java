package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Clientes;

import com.copeik.hibernate.model.MClientes;

@Component("ClientesConvertidor")
public class DireccionConvertidor {

	public List<MClientes> convertirLista(List<Clientes> arts){
		List<MClientes> mcliente = new ArrayList<>();
		
		for(Clientes art : arts) {
			mcliente.add(new MClientes(art));
		}
		
		return mcliente;
	}
	
}