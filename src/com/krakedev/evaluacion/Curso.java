package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Curso {
	
	private String id;
	
	private ArrayList<Estudiante> estudiantes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Estudiante> getEstudiante() {
		return estudiantes;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Curso(String id) {
		super();
		this.id = id;
		this.estudiantes = new ArrayList<Estudiante>();
	}
	 
	public void Agregar(Estudiante estudiante) {
		 
		this.estudiantes.add(estudiante);
		 
	}
	
	public Estudiante buscarPorCedula(double cedula) {

	    for (Estudiante estudiante : estudiantes) {

	        if (estudiante.getCedula() == cedula) {
	            return estudiante;
	        }

	    }

	    return null;
	}

}