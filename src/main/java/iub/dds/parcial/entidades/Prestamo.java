package iub.dds.parcial.entidades;

import java.time.LocalDate;

/**
 * Representa el préstamo de un Libro a un Lector, gestionado por un Empleado.
 */
public class Prestamo extends ClaseBase {
    // Fecha en que se entrego el libro, formato texto "dd-MM-yyyy"

    private LocalDate fechaSalida;
    // Fecha limite para devolver el libro, formato texto "dd-MM-yyyy"
    private LocalDate limiteEntrega;
    // Estado del prestamo: "activo" o "devuelto"
    private String estado;

    /**
     * Crea un prestamo de libro.
     *
     * @param fechaSalida fecha de entrega del libro (texto "dd-MM-yyyy")
     * @param limiteEntrega fecha limite de devolucion (texto "dd-MM-yyyy")
     * @param estado estado actual del prestamo ("activo"/"devuelto")
     */
    public Prestamo(int id, LocalDate fechaSalida, LocalDate limiteEntrega, String estado) {
        super(id);
        this.fechaSalida = fechaSalida;
        this.limiteEntrega = limiteEntrega;
        this.estado = estado;
    }


    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getLimiteEntrega() {
        return limiteEntrega;
    }

    public void setLimiteEntrega(LocalDate limiteEntrega) {
        this.limiteEntrega = limiteEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
