package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos dos maquinas al negocio
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);
		negocio.agregarMaquina("Club", "Cerveza roja", 0.03);
		negocio.agregarMaquina("Brahama", "Cerveza marron", 0.01);

		System.out.println("Cantidad de maquinas: " + negocio.getMaquinas().size());

		// Cargamos todas las maquinas
		negocio.cargarMaquinas();

		System.out.println("Cantidad actual maquina 1: "
				+ negocio.getMaquinas().get(0).getCantidadActual());

		System.out.println("Cantidad actual maquina 2: "
				+ negocio.getMaquinas().get(1).getCantidadActual());
		
		System.out.println("Cantidad actual maquina 3: "
				+ negocio.getMaquinas().get(1).getCantidadActual());


	}

}
