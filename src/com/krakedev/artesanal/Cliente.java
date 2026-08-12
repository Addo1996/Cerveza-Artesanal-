package com.krakedev.artesanal;

public class Cliente {
	
	private String Nombre;
	private String Cedula;
	private int Codigo;
	private double totalConsumido;
	
	
	public Cliente(String nombre, String cedula) {
		this.Nombre = nombre;
		this.Cedula = cedula;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public double getTotalConsumido() {
		return totalConsumido;
	}
	public void setTotalConsumido(double totalConsumido) {
		this.totalConsumido = totalConsumido;
	}
	
	
	

}
