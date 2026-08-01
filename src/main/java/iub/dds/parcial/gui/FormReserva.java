package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Reserva;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Reservas. Orden de campos segun
 * Reflect.getFields(Reserva.class): solicitud, estado.
 */
public class FormReserva extends FormularioBase<Reserva> {

    public FormReserva() {
        super(Reserva.class, Datos.instancia().reservas());
    }

    /**
     * Construye una Reserva leyendo los campos del formulario en el orden de
     * declaracion: solicitud, estado.
     */
    @Override
    protected Reserva crearElemento() {
        return new Reserva(
                getInt(fld00), // id
                getDate(fld01), // solicitud
                getString(fld02) // estado ("pendiente"/"completada")
        );
    }

}
