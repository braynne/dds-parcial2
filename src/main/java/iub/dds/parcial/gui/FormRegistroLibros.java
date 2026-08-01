package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.RegistroLibros;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar RegistroLibros. Orden de campos segun
 * Reflect.getFields(RegistroLibros.class): añoLectivo,
 * actualizado.
 */
public class FormRegistroLibros extends FormularioBase<RegistroLibros> {

    public FormRegistroLibros() {
        super(RegistroLibros.class, Datos.instancia().registrosLibros());
    }

    /**
     * Construye un RegistroLibros leyendo los campos del formulario en el orden
     * de declaracion: añoLectivo, actualizado.
     */
    @Override
    protected RegistroLibros crearElemento() {
        return new RegistroLibros(
                getInt(fld00), // id
                getInt(fld01), // anioLectivo
                getDate(fld02) // actualizado (texto "dd-MM-yyyy")
        );
    }

}
