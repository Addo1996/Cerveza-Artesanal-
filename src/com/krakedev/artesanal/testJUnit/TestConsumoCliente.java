package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestConsumoCliente {

	@Test
	public void probarConsumo() {

		Maquina maquinaA = new Maquina("001", "Pilsener", "rubia", 0.02, 8000);
		Negocio barDeMoe = new Negocio("Bar de Moe", maquinaA);
		Cliente cliente = new Cliente("Jose", "1492764538");

		barDeMoe.cargarMaquinaA();
		barDeMoe.consumirCervezaMaquinaA(cliente, 100);

		assertEquals(7700, maquinaA.getCantidadActual(), 0.001);
		assertEquals(2.0, cliente.getTotalConsumido(), 0.001);
		
		barDeMoe.consumirCervezaMaquinaA(cliente, 200);

		assertEquals(7500, maquinaA.getCantidadActual(),0.001);
		assertEquals(6.0, cliente.getTotalConsumido(),0.001);
	}
}