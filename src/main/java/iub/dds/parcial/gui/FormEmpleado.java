package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Empleado;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Empleados. Orden de campos segun
 * Reflect.getFields(Empleado.class): nombre, cargo, turno.
 */
public class FormEmpleado extends FormularioBase<Empleado> {

    public FormEmpleado() {
        super(Empleado.class, Datos.instancia().empleados());
    }

    /**
     * Construye un Empleado leyendo los campos del formulario en el orden de
     * declaracion: nombre, cargo, turno.
     */
    @Override
    protected Empleado crearElemento() {
        return new Empleado(
                getInt(fld00), // id
                getString(fld01), // nombre
                getString(fld02), // cargo
                getInt(fld03) // turno
        );
    }

}
