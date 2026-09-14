package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

	@Test
	public void testAgregarMaquina() {

		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos una maquina al negocio
		boolean resultado = negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);

		assertTrue(resultado);
		assertEquals(1, negocio.getMaquinas().size());
	}

}