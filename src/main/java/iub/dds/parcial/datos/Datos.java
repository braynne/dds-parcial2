package iub.dds.parcial.datos;

import iub.dds.parcial.entidades.Cliente;

/**
 * Clase que guarda los datos en memoria. 
 */
public class Datos {
	// Instancia unica (singleton)
	private static final Datos instancia = new Datos();
	
	// Los repositorios van aquí
	private final Repositorio<Cliente> clientes = new Repositorio<>();
	
	// Un constructor en privado para que no se pueda crear nuevas instancias
	private Datos() {}
	
	// Getters
	
	public static Datos instancia() {
		return instancia;
	}

	public Repositorio<Cliente> clientes() {
		return clientes;
	}
	
}