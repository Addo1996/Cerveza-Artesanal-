package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {

	public static void main(String[] args) {

		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos maquinas al negocio
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);
		negocio.agregarMaquina("Club", "Cerveza roja", 0.03);

		// Obtenemos el codigo de la primera maquina
		String codigo = negocio.getMaquinas().get(0).getCodigo();

		// Buscamos la maquina por su codigo
		Maquina maquina = negocio.recuperarMaquina(codigo);

		if (maquina != null) {
			System.out.println("Maquina encontrada:");
			maquina.imprimir();
		} else {
			System.out.println("Maquina no encontrada");
		}

		negocio.agregarMaquina("Brahama", "Cerveza marron", 0.01);

		String codigo1 = "M-999";

		// Buscamos una maquina con un codigo que no existe
		Maquina maquina1 = negocio.recuperarMaquina(codigo1);

		if (maquina1 != null) {
			System.out.println("Maquina encontrada:");
			maquina1.imprimir();
		} else {
			System.out.println("Maquina no encontrada");
		}

	}

}