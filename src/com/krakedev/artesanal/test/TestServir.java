package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Maquina negra = new Maquina("C001", "Club", ": Con mas % de alcohol", 0.03, 8000);
		System.out.println("--------Estado Inicial-------");
		negra.imprimir();
		
		System.out.println("--------Llenando maquina-------");
		negra.llenarMaquina();
		negra.imprimir();
		
		System.out.println("--------Servir 1000ML-------");
		double valor;
		valor = negra.servirCerveza(1000);
		System.out.println("Valor a pagar :" + valor);
		
		System.out.println("--------Servir 2000ML-------");
		double valor1;
		valor1 = negra.servirCerveza(2000);
		System.out.println("Valor a pagar :" + valor1);
		negra.imprimir();
		
		
		System.out.println("--------Servir 6000ML-------");
		double valor2;
		valor2 = negra.servirCerveza(6000);
		System.out.println("Valor a pagar :" + valor2);
		negra.imprimir();

	}

}
