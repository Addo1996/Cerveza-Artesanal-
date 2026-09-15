package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

	public static void main(String[] args) {

		NegocioMejorado negocio = new NegocioMejorado();

		// Registramos un cliente para probar la lista de clientes
		negocio.registrarCliente("Mario", "1726037659");

	}

}