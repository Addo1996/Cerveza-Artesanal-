package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NegocioMejorado negocio = new NegocioMejorado();
		String codigo = negocio.generarCodigo();

		System.out.println("Codigo generado: " + codigo);
	}

}

	


