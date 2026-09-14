package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

	// Lista donde se almacenan las maquinas del negocio
	private ArrayList<Maquina> maquinas = new ArrayList<>();

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	// Genera un codigo aleatorio para la maquina
	public String generarCodigo() {
		int numero;
		numero = (int) (Math.random() * 100) + 1;
		return "M-" + numero;
	}

	// Agrega una nueva maquina a la lista
	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {

		// Generamos el codigo de la maquina
		String codigo = generarCodigo();

		// Buscamos si ya existe una maquina con ese codigo
		Maquina maquinaExistente = recuperarMaquina(codigo);

		// Verificamos si el codigo ya existe
		if (maquinaExistente != null) {
			return false;
		}

		// Creamos la maquina con los datos recibidos
		Maquina maquina = new Maquina(codigo, nombreCerveza, descripcion, precioPorMl);

		// Agregamos la maquina a la lista
		maquinas.add(maquina);

		return true;
	}

	// Carga de cerveza todas las maquinas del negocio
	public void cargarMaquinas() {

		for (Maquina maquina : maquinas) {
			maquina.llenarMaquina();
		}

	}

	// Busca una maquina por su codigo
	public Maquina recuperarMaquina(String codigo) {

		for (Maquina maquina : maquinas) {

			if (maquina.getCodigo().equals(codigo)) {
				return maquina;
			}

		}

		return null;
	}

}