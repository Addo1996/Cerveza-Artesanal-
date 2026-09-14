package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigo {

	@Test
	public void probarGenerarCodigo() {

		NegocioMejorado negocio = new NegocioMejorado();

		// Generamos un codigo para comprobar que el metodo funciona
		String codigo = negocio.generarCodigo();

		assertNotNull(codigo);
	}

}