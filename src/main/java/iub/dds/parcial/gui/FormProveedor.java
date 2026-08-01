package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Proveedor;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Proveedores. Orden de campos segun
 * Reflect.getFields(Proveedor.class): razonSocial, telefono, ciudad.
 */
public class FormProveedor extends FormularioBase<Proveedor> {

    public FormProveedor() {
        super(Proveedor.class, Datos.instancia().proveedores());
    }

    /**
     * Construye un Proveedor leyendo los campos del formulario en el orden de
     * declaracion: razonSocial, telefono, ciudad.
     */
    @Override
    protected Proveedor crearElemento() {
        return new Proveedor(
                getInt(fld00), // id
                getString(fld01), // razonSocial
                getString(fld02), // telefono
                getString(fld03) // ciudad
        );
    }

}
