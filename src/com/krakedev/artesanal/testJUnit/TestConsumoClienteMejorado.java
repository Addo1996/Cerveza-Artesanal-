package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoClienteMejorado {

	@Test
	public void probarConsumo() {

		// Creamos el negocio
		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos una maquina
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);

		// Cargamos la maquina
		negocio.cargarMaquinas();

		// Registramos un cliente
		negocio.registrarCliente("Mario", "1726037659");

		// Recuperamos el codigo de la maquina
		String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

		// Realizamos un consumo de 100 ml
		negocio.consumirCerveza(100, codigoMaquina, 100);

		// Verificamos la cantidad de cerveza que queda en la maquina
		assertEquals(9700, negocio.getMaquinas().get(0).getCantidadActual());

		// Verificamos el total consumido por el cliente
		assertEquals(2, negocio.buscarClientePorCodigo(100).getTotalConsumido());
	}
}