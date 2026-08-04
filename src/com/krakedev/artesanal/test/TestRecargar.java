package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean resultado;

		Maquina negra = new Maquina("Club", ": Con mas % de alcohol", 0.03, 8000);
		System.out.println("--------Estado Inicial-------");
		negra.imprimir();

		resultado = negra.recargarCerveza(3000);
		System.out.println("--------Estado Recargado-------");
		System.out.println("¿ Se recargo correctamente?" + resultado);
		negra.imprimir();
	}

}
