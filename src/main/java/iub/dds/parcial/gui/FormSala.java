package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Sala;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Salas. Orden de campos segun
 * Reflect.getFields(Sala.class): nombre, piso, estante.
 */
public class FormSala extends FormularioBase<Sala> {

    public FormSala() {
        super(Sala.class, Datos.instancia().salas());
    }

    /**
     * Construye una Sala leyendo los campos del formulario en el orden de
     * declaracion: nombre, piso, estante.
     */
    @Override
    protected Sala crearElemento() {
        return new Sala(
                getInt(fld00), // id
                getString(fld01), // nombre
                getInt(fld02), // piso
                getInt(fld03) // estante
        );
    }

}
