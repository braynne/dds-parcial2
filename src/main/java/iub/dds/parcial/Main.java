package iub.dds.parcial;

import iub.dds.parcial.gui.ButtonInfo;
import iub.dds.parcial.gui.FormCategoria;
import iub.dds.parcial.gui.FormEmpleado;
import iub.dds.parcial.gui.FormLector;
import iub.dds.parcial.gui.FormLibro;
import iub.dds.parcial.gui.FormMulta;
import iub.dds.parcial.gui.FormPrestamo;
import iub.dds.parcial.gui.FormProveedor;
import iub.dds.parcial.gui.FormRegistroLibros;
import iub.dds.parcial.gui.FormReserva;
import iub.dds.parcial.gui.FormSala;
import iub.dds.parcial.gui.Menu;


public class Main {
	/**
	 * Punto de entrada de la aplicacion. Crea el Menu principal con un
	 * boton por cada uno de los 10 formularios del dominio Biblioteca
	 * Municipal (Lector, Empleado, Libro, Categoria, Sala, Proveedor,
	 * RegistroLibros, Prestamo, Multa y Reserva), dentro del limite de
	 * 12 botones que soporta Menu.
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		java.awt.EventQueue.invokeLater(() -> new Menu("BIBLIOTECA MUNICIPAL",
			new ButtonInfo("Lectores", new FormLector()),
			new ButtonInfo("Empleados", new FormEmpleado()),
			new ButtonInfo("Libros", new FormLibro()),
			new ButtonInfo("Categorias", new FormCategoria()),
			new ButtonInfo("Salas", new FormSala()),
			new ButtonInfo("Proveedores", new FormProveedor()),
			new ButtonInfo("Registro Libros", new FormRegistroLibros()),
			new ButtonInfo("Prestamos", new FormPrestamo()),
			new ButtonInfo("Multas", new FormMulta()),
			new ButtonInfo("Reservas", new FormReserva())
		).setVisible(true));
	}
}
