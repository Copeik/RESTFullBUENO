package com.copeik.hibernate.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.copeik.hibernate.entity.Clientes;
import com.copeik.hibernate.entity.Especificaciones;
import com.copeik.hibernate.model.MClientes;
import com.copeik.hibernate.model.MEspecificaciones;

@Component("especificacionesConvertidor")
public class EspecificacionesConvertidor {

	public List<MEspecificaciones> convertirLista(List<Especificaciones> arts){
		List<MEspecificaciones> mcliente = new ArrayList<>();
		
		for(Especificaciones art : arts) {
			mcliente.add(new MEspecificaciones(art));
		}
		
		return mcliente;
	}
	
}