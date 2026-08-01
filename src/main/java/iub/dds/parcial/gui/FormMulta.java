package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Multa;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Multas. Orden de campos segun
 * Reflect.getFields(Multa.class): monto, emision, pagada.
 */
public class FormMulta extends FormularioBase<Multa> {

    public FormMulta() {
        super(Multa.class, Datos.instancia().multas());
    }

    /**
     * Construye una Multa leyendo los campos del formulario en el orden de
     * declaracion. El monto (double) se lee con el helper getDouble de Swing
     * (reutilizado, no se duplica logica de parseo). El campo pagada (s/n), (y/n) o (true/false).
     */
    @Override
    protected Multa crearElemento() {
        return new Multa(
                getInt(fld00), // id
                getDouble(fld01), // monto
                getDate(fld02), // fechaEmision
                getBoolean(fld03) // pagada ('s'/'n')
        );
    }

}
