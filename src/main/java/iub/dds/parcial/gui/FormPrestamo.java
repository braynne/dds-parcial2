package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Prestamo;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Prestamos. Orden de campos segun
 * Reflect.getFields(Prestamo.class): fechaSalida, fechaLimiteEntrega, estado.
 */
public class FormPrestamo extends FormularioBase<Prestamo> {

    public FormPrestamo() {
        super(Prestamo.class, Datos.instancia().prestamos());
    }

    /**
     * Construye un Prestamo leyendo los campos del formulario en el orden de
     * declaracion.
     */
    @Override
    protected Prestamo crearElemento() {
        return new Prestamo(
                getInt(fld00), // id
                getDate(fld01), // fechaSalida
                getDate(fld02), // limiteEntrega
                getString(fld03) // estado ("activo"/"devuelto")
        );
    }

}
