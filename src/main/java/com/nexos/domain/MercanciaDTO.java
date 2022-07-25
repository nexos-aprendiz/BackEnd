package com.nexos.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MercanciaDTO {
	
	private Long mercanciaId;
	private String nombre;
	private String cantidad;
	private Date fechaIngreso;
	private Date fechaModificacion;
	private Long idEmpleado;
	private Long idCreadoPor;

}
