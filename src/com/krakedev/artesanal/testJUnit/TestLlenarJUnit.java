package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestLlenarJUnit {

	@Test
	public void testLlenarMaquina() {

		Maquina rubia = new Maquina("C001", "Pilsener", "Cerveza", 0.02, 8000);
		rubia.llenarMaquina();

		assertEquals(7800, rubia.getCantidadActual(), 0.0001);
	}

	@Test
	public void testGetCodigo() {

		Maquina maquina = new Maquina("C002", "Club", "Cerveza Extra-Rubia", 0.02, 20000);

		assertEquals("C002", maquina.getCodigo());
	}

}
