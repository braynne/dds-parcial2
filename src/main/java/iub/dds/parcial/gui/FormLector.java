package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Lector;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Lectores. Orden de campos segun
 * Reflect.getFields(Lector.class): nombre, documento,
 * correo, telefono.
 */
public class FormLector extends FormularioBase<Lector> {

    public FormLector() {
        super(Lector.class, Datos.instancia().lectores());
    }

    /**
     * Construye un Lector leyendo los campos del formulario en el orden de
     * declaracion: nombre, documento, correo, telefono.
     */
    @Override
    protected Lector crearElemento() {
        return new Lector(
                getInt(fld00), // id
                getString(fld01), // nombre
                getLong(fld02), // documento
                getString(fld03), // correo
                getLong(fld04) // telefono
        );
    }

}
