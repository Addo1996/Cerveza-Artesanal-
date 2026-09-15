package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

	// Lista donde se almacenan las maquinas del negocio
	private ArrayList<Maquina> maquinas = new ArrayList<>();

	// Lista donde se almacenan los clientes del negocio
	private ArrayList<Cliente> clientes = new ArrayList<>();

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}

	// Registra un nuevo cliente en la lista
	public void registrarCliente(String nombre, String cedula) {
		Cliente cliente = new Cliente(nombre, cedula);
		cliente.setCodigo(ultimoCodigo);
		ultimoCodigo++;
		// Agregamos el cliente a la lista
		clientes.add(cliente);
	}

	// Busca un cliente por su cedula
	public Cliente buscarClientePorCedula(String cedula) {

		for (Cliente cliente : clientes) {

			// Comparamos la cedula recibida con la cedula del cliente
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	// Busca un cliente por su codigo
	public Cliente buscarClientePorCodigo(int codigo) {
		for (Cliente cliente : clientes) {

			if (cliente.getCodigo() == codigo) {

				return cliente;
			}
		}

		return null;
	}

	// Genera un codigo aleatorio para la maquina
	public String generarCodigo() {
		int numero;
		numero = (int) (Math.random() * 100) + 1;
		return "M-" + numero;
	}

	// Codigo que se utiliza para registrar los clientes
	private int ultimoCodigo = 100;

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
	
	// Permite que un cliente consuma cerveza de una maquina
	public void consumirCerveza(int codigoCliente, String codigoMaquina, double cantidad) {

		Maquina maquina = recuperarMaquina(codigoMaquina);
		Cliente cliente = buscarClientePorCodigo(codigoCliente);

		double valor = maquina.servirCerveza(cantidad);
		// Registramos el valor consumido por el cliente
		registrarConsumo(cliente, valor);

	}
	
	// Registra el valor consumido por un cliente
	public void registrarConsumo(Cliente cliente, double valor) {

		// Sumamos el nuevo consumo al total que ya tiene el cliente
		cliente.setTotalConsumido(cliente.getTotalConsumido() + valor);
	}
	
	// Calcula el valor total vendido por el negocio
	public double consultarValorVendido() {

		double total = 0;

		for (Cliente cliente : clientes) {
			total = total + cliente.getTotalConsumido();
		}

		return total;
	}

}