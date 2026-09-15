package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarCliente {

    public static void main(String[] args) {

        NegocioMejorado negocio = new NegocioMejorado();

        // Registramos un cliente
        negocio.registrarCliente("Mario", "1726037659");

        // Buscamos el cliente por su cedula
        Cliente cliente = negocio.buscarClientePorCedula("1726037659");

        // Mostramos el resultado
        System.out.println("Busqueda por cedula de Cliente");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getCedula());
        System.out.println(cliente.getCodigo());
        
        
     // Buscamos el cliente por su codigo
        Cliente clienteCodigo = negocio.buscarClientePorCodigo(100);

        // Mostramos el resultado
        System.out.println("Busqueda por codigo de Cliente");
        System.out.println(clienteCodigo.getNombre());
        System.out.println(clienteCodigo.getCedula());
        System.out.println(clienteCodigo.getCodigo());
    }
}