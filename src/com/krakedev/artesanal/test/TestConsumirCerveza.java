package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumirCerveza {

	public static void main(String[] args) {

		NegocioMejorado negocio = new NegocioMejorado();

		// Agregamos una maquina al negocio
		negocio.agregarMaquina("Pilsener", "Cerveza rubia", 0.02);

		// Registramos un cliente
		negocio.registrarCliente("Mario", "1726037659");
		
		// Cargamos todas las maquinas
				negocio.cargarMaquinas();
		
		// Recuperamos la maquina para obtener su codigo
		String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();
		

		// Realizamos un consumo de 100 ml
		negocio.consumirCerveza(100, codigoMaquina, 100);
		
		// Buscamos el cliente por su codigo
		System.out.println("El valor consumido es : "+ negocio.buscarClientePorCodigo(100).getTotalConsumido());

		// Mostramos la cantidad actual de cerveza en la maquina
		System.out.println("La cantidad actual de la maquina es : " + negocio.getMaquinas().get(0).getCantidadActual());

	}

}