package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {

	@Test
	public void testMaquinaEncontrada() {

		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos una maquina al negocio
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);

		String codigo = negocio.getMaquinas().get(0).getCodigo();

		// Buscamos la maquina por su codigo
		Maquina maquina = negocio.recuperarMaquina(codigo);

		assertNotNull(maquina);
	}

	@Test
	public void testMaquinaNoEncontrada() {

		NegocioMejorado negocio = new NegocioMejorado();

		// Buscamos una maquina con un codigo que no existe
		Maquina maquina = negocio.recuperarMaquina("M-999");

		assertNull(maquina);
	}

}