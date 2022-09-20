package com.nexos.translator;

import org.springframework.stereotype.Component;

import com.nexos.domain.MercanciaDTO;
import com.nexos.model.Mercancia;

@Component
public class TranslateMercanciaDTO implements Translator<Mercancia, MercanciaDTO> {

	@Override
	public MercanciaDTO translate(Mercancia mercancia) {
		
		MercanciaDTO imput = new MercanciaDTO();
		imput.setId(mercancia.getId());
		imput.setNombre(mercancia.getNombre());
		imput.setCantidad(mercancia.getCantidad());
		imput.setFecha_ingreso(mercancia.getFecha_ingreso());
		imput.setId_empleado(mercancia.getId_empleado());
		imput.setFecha_modificacion(mercancia.getFecha_modificacion());
		return imput;
	}

}
