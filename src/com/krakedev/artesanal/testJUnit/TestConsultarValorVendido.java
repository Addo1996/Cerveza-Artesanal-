package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestConsultarValorVendido {

	@Test
	public void probarValorVendido() {

		// Creamos el negocio
		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos una maquina
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);

		// Cargamos la maquina
		negocio.cargarMaquinas();

		// Registramos dos clientes
		negocio.registrarCliente("Mario", "1726037659");
		negocio.registrarCliente("Juan", "1726037660");

		// Recuperamos el codigo de la maquina
		String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

		// Primer cliente consume 100 ml = $2
		negocio.consumirCerveza(100, codigoMaquina, 100);

		// Segundo cliente consume 200 ml = $4
		negocio.consumirCerveza(101, codigoMaquina, 200);

		// Consultamos el total vendido
		double total = negocio.consultarValorVendido();

		// Verificamos que el total sea $6
		assertEquals(6, total);
	}
}