package iub.dds.parcial.entidades;

import java.time.LocalDate;

/**
 * Representa la reserva de un Libro hecha por un Lector, cuando el libro no
 * está disponible para préstamo inmediato. Se relaciona con Lector y Libro
 * mediante referencias por id (idLector, idLibro).
 */
public class Reserva extends ClaseBase {

    // Fecha en que se solicito la reserva, formato texto "dd-MM-yyyy"
    private LocalDate solicitud;
    // Estado de la reserva: "pendiente" o "completada"
    private String estado;

    /**
     * Crea una reserva de libro.
     *
     * @param solicitud fecha de la solicitud (texto "dd-MM-yyyy")
     * @param estado estado de la reserva ("pendiente"/"completada")
     */
    public Reserva(int id, LocalDate solicitud, String estado) {
        super(id);
        this.solicitud = solicitud;
        this.estado = estado;
    }

    public LocalDate getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(LocalDate solicitud) {
        this.solicitud = solicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
