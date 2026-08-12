package com.krakedev.evaluacion;

public class Estudiante {
	
	private double Cedula;
	private String Nombre;
	private String Apellido;
	
	
	public double getCedula() {
		return Cedula;
	}
	public void setCedula(double cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Estudiante(double cedula, String nombre, String apellido) {
		super();
		Cedula = cedula;
		Nombre = nombre;
		Apellido = apellido;
	}
	
	

}
