package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maquina negra= new Maquina("C001", "Club", ": Con mas % de alcohol", 0.03, 8000);
		negra.imprimir();
		
		negra.llenarMaquina();
		negra.imprimir();
		
		Maquina marron= new Maquina("C002", "Monkey", ": Con mas cuerpo y sabor", 0.03);
		marron.imprimir();
		
		marron.llenarMaquina();
		marron.imprimir();

	}

}
