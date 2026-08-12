package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Negocio;

public class TestAsignarCodigoCliente {
	
	
	@Test
	public void asignarCodigo() {
		
		Negocio barDeMoe = new Negocio();
		
		Cliente mario = new Cliente("Mario", "1726037659");
		
		Cliente juan = new Cliente("Juan", "1729037639");
		
		barDeMoe.asiganarCodigoClientes(mario);
		barDeMoe.asiganarCodigoClientes(juan);
		
		assertEquals(100, mario.getCodigo());
		assertEquals(101, juan.getCodigo());
	}

}
