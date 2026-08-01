package iub.dds.parcial.datos;

import iub.dds.parcial.entidades.Categoria;
import iub.dds.parcial.entidades.Empleado;
import iub.dds.parcial.entidades.Lector;
import iub.dds.parcial.entidades.Libro;
import iub.dds.parcial.entidades.Multa;
import iub.dds.parcial.entidades.Prestamo;
import iub.dds.parcial.entidades.Proveedor;
import iub.dds.parcial.entidades.RegistroLibros;
import iub.dds.parcial.entidades.Reserva;
import iub.dds.parcial.entidades.Sala;

/**
 * Clase que guarda los datos en memoria.
 */
public class Datos {
	// Instancia unica (singleton)
	private static final Datos instancia = new Datos();

	// Repositorio de lectores de la Biblioteca Municipal
	private final Repositorio<Lector> lectores = new Repositorio<>();
	// Repositorio de empleados de la Biblioteca Municipal
	private final Repositorio<Empleado> empleados = new Repositorio<>();
	// Repositorio de libros del catalogo de la biblioteca
	private final Repositorio<Libro> libros = new Repositorio<>();
	// Repositorio de categorias de libros
	private final Repositorio<Categoria> categorias = new Repositorio<>();
	// Repositorio de salas de la biblioteca
	private final Repositorio<Sala> salas = new Repositorio<>();
	// Repositorio de proveedores de libros
	private final Repositorio<Proveedor> proveedores = new Repositorio<>();
	// Repositorio de registros anuales de control de libros
	private final Repositorio<RegistroLibros> registrosLibros = new Repositorio<>();
	// Repositorio de prestamos de libros
	private final Repositorio<Prestamo> prestamos = new Repositorio<>();
	// Repositorio de multas por prestamos
	private final Repositorio<Multa> multas = new Repositorio<>();
	// Repositorio de reservas de libros
	private final Repositorio<Reserva> reservas = new Repositorio<>();

	// Un constructor en privado para que no se pueda crear nuevas instancias
	private Datos() {}

	// Getters

	public static Datos instancia() {
		return instancia;
	}

	/** @return el repositorio de lectores */
	public Repositorio<Lector> lectores() {
		return lectores;
	}

	/** @return el repositorio de empleados */
	public Repositorio<Empleado> empleados() {
		return empleados;
	}

	/** @return el repositorio de libros */
	public Repositorio<Libro> libros() {
		return libros;
	}

	/** @return el repositorio de categorias */
	public Repositorio<Categoria> categorias() {
		return categorias;
	}

	/** @return el repositorio de salas */
	public Repositorio<Sala> salas() {
		return salas;
	}

	/** @return el repositorio de proveedores */
	public Repositorio<Proveedor> proveedores() {
		return proveedores;
	}

	/** @return el repositorio de registros de libros */
	public Repositorio<RegistroLibros> registrosLibros() {
		return registrosLibros;
	}

	/** @return el repositorio de prestamos */
	public Repositorio<Prestamo> prestamos() {
		return prestamos;
	}

	/** @return el repositorio de multas */
	public Repositorio<Multa> multas() {
		return multas;
	}

	/** @return el repositorio de reservas */
	public Repositorio<Reserva> reservas() {
		return reservas;
	}

}
