package com.krakedev.artesanal;

public class Negocio {
	
	private String Nombre;
	
	private Maquina maquinaA;
	
	private int ultimoCodigo = 100;
	
	
	public Negocio() {
		
	}
	
	
	public Negocio(String nombre, Maquina maquinaA) {
		super();
		Nombre = nombre;
		this.maquinaA = maquinaA;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Maquina getMaquinaA() {
		return maquinaA;
	}

	public void setMaquinaA(Maquina maquinaA) {
		this.maquinaA = maquinaA;
	}
	
	public void asiganarCodigoClientes(Cliente cliente) {
		
		cliente.setCodigo(ultimoCodigo);
		ultimoCodigo++;
	}
	
	public void cargarMaquinaA() {
		
		maquinaA.llenarMaquina();
		
	}
	
	public void consumirCervezaMaquinaA(Cliente cliente, double ml) {
		
		double valor = maquinaA.servirCerveza(ml);
		cliente.setTotalConsumido(cliente.getTotalConsumido() + valor);
	}

}
