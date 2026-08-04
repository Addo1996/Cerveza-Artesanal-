package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {

	private static final double TOLERANCIA = 0.001;

	/*
	 * Valida que la máquina sirva cerveza cuando tiene
	 * suficiente cantidad disponible.
	 *
	 * También verifica que:
	 * - Retorne correctamente el valor a pagar.
	 * - Descuente la cantidad servida de la cantidad actual.
	 *
	 * Se utiliza el constructor de cuatro parámetros.
	 */
	@Test
	public void testServirCervezaConCantidadSuficiente() {

		Maquina maquina = new Maquina(
				"Pilsener",
				"Cerveza rubia",
				0.02,
				5000);

		maquina.recargarCerveza(1000);

		double valorPagado = maquina.servirCerveza(300);

		assertEquals(6.00, valorPagado, TOLERANCIA);
		assertEquals(700, maquina.getCantidadActual(), TOLERANCIA);
	}

	/*
	 * Valida que la máquina pueda servir exactamente toda
	 * la cerveza disponible.
	 *
	 * Después de servir, la cantidad actual debe quedar en cero.
	 */
	@Test
	public void testServirTodaLaCervezaDisponible() {

		Maquina maquina = new Maquina(
				"Club",
				"Cerveza premium",
				0.03,
				2000);

		maquina.recargarCerveza(500);

		double valorPagado = maquina.servirCerveza(500);

		assertEquals(15.00, valorPagado, TOLERANCIA);
		assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
	}

	/*
	 * Valida que la máquina no sirva cerveza cuando
	 * la cantidad solicitada es mayor que la disponible.
	 *
	 * También verifica que:
	 * - Retorne cero.
	 * - No modifique la cantidad actual.
	 */
	@Test
	public void testNoServirCuandoCantidadEsInsuficiente() {

		Maquina maquina = new Maquina(
				"Corona",
				"Cerveza clara",
				0.025);

		maquina.recargarCerveza(400);

		double cantidadAntes = maquina.getCantidadActual();

		double valorPagado = maquina.servirCerveza(500);

		assertEquals(0, valorPagado, TOLERANCIA);
		assertEquals(cantidadAntes,
				maquina.getCantidadActual(),
				TOLERANCIA);
	}

	/*
	 * Valida que una máquina recién creada no pueda servir
	 * cerveza porque su cantidad actual comienza en cero.
	 *
	 * Se utiliza el constructor de tres parámetros.
	 */
	@Test
	public void testServirConMaquinaVacia() {

		Maquina maquina = new Maquina(
				"Heineken",
				"Cerveza importada",
				0.04);

		double valorPagado = maquina.servirCerveza(250);

		assertEquals(0, valorPagado, TOLERANCIA);
		assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
	}

	/*
	 * Valida el cálculo del valor a pagar con una cantidad
	 * que produce un resultado decimal.
	 *
	 * El valor debe ser:
	 * cantidad servida multiplicada por precio por mililitro.
	 */
	@Test
	public void testCalcularValorConDecimales() {

		Maquina maquina = new Maquina(
				"Stella Artois",
				"Cerveza lager",
				0.015,
				3000);

		maquina.recargarCerveza(1000);

		double valorPagado = maquina.servirCerveza(333);

		assertEquals(4.995, valorPagado, TOLERANCIA);
		assertEquals(667, maquina.getCantidadActual(), TOLERANCIA);
	}

	/*
	 * Valida el funcionamiento después de llenar la máquina.
	 *
	 * Debe servir correctamente, retornar el valor correspondiente
	 * y descontar la cantidad servida.
	 */
	@Test
	public void testServirDespuesDeLlenarMaquina() {

		Maquina maquina = new Maquina(
				"Pilsener Light",
				"Cerveza ligera",
				0.01);

		maquina.llenarMaquina();

		double cantidadAntes = maquina.getCantidadActual();

		double valorPagado = maquina.servirCerveza(600);

		assertEquals(6.00, valorPagado, TOLERANCIA);
		assertEquals(cantidadAntes - 600,
				maquina.getCantidadActual(),
				TOLERANCIA);
	}
}