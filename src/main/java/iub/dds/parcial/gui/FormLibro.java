package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Libro;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Libros. Orden de campos segun
 * Reflect.getFields(Libro.class): isbn, titulo, autor, editorial, anioEdicion.
 */
public class FormLibro extends FormularioBase<Libro> {

    public FormLibro() {
        super(Libro.class, Datos.instancia().libros());
    }

    /**
     * Construye un Libro leyendo los campos del formulario en el orden de
     * declaracion.
     */
    @Override
    protected Libro crearElemento() {
        return new Libro(
                getString(fld00), // isbn
                getString(fld01), // titulo
                getString(fld02), // autor
                getString(fld03), // editorial
                getInt(fld04) // anioEdicion
        );
    }

}
