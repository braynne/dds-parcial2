package iub.dds.parcial.entidades;

import java.time.LocalDate;

/**
 * Representa una multa aplicada por un préstamo (por ejemplo, por retraso en la
 * devolución de un libro). Se relaciona con Prestamo mediante la referencia por
 * id (idPrestamo).
 */
public class Multa extends ClaseBase {
    // Monto de dinero de la multa
    private double monto;
    // Fecha en que se emitio la multa, formato texto "dd-MM-yyyy"
    private LocalDate emision;
    // Indica si la multa ya fue pagada: 's' (si) o 'n' (no)
    private boolean pagada;

    /**
     * Crea una multa asociada a un prestamo.
     *
     * @param monto monto de la multa
     * @param emision fecha de emision (texto "dd-MM-yyyy")
     * @param pagada 's' si ya fue pagada, 'n' si no
     */
    public Multa(int id, double monto, LocalDate emision, boolean pagada) {
        super(id);
        this.monto = monto;
        this.emision = emision;
        this.pagada = pagada;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getEmision() {
        return emision;
    }

    public void setEmision(LocalDate emision) {
        this.emision = emision;
    }

    public boolean getPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

}
