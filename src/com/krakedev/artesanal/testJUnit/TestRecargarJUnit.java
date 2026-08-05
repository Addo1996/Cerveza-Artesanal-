package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {

	@Test
	public void testRecargaExitosa() {

		Maquina rubia = new Maquina("C001", "Pilsener", "Cerveza", 0.02, 8000);

		boolean resultado = rubia.recargarCerveza(3000);

		assertTrue(resultado);
		assertEquals(3000, rubia.getCantidadActual(), 0.0001);
	}

	@Test
	public void testRecargaFallida() {

		Maquina negra = new Maquina("C002", "Club", "Cerveza fría", 0.02, 8000);

		negra.recargarCerveza(7000);

		boolean resultado = negra.recargarCerveza(1000);

		assertFalse(resultado);
		assertEquals(7000, negra.getCantidadActual(), 0.0001);
	}
}