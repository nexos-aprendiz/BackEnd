package com.nexos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nexos.model.HistorialMercancia;

@Repository
public interface HistorialMercanciaRepository extends JpaRepository<HistorialMercancia, Long> {
	
	@Query("SELECT h.id, e.nombre, m.nombre, h.fecha_modificacion, h.operacion\r\n"
			+ "FROM HistorialMercancia h\r\n"
			+ "JOIN Mercancia m\r\n"
			+ "ON h.id_mercancia = m.id"
			+ "JOIN Empleados e\r\n"
			+ "ON h.id_empleado = e.id\r\n")
	List<HistorialMercancia> getAllHistorialMercancia(Long id);
}