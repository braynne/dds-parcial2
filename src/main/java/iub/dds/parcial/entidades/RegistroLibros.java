package iub.dds.parcial.entidades;

import java.time.LocalDate;

/**
 * Representa un registro anual de control de libros de la biblioteca, usado
 * para llevar la cuenta de las actualizaciones del catálogo por año lectivo.
 */
public class RegistroLibros extends ClaseBase {

    // Anio lectivo al que corresponde este registro
    private int añoLectivo;
    // Fecha de la ultima actualizacion del registro, en formato "dd-MM-yyyy" como texto simple
    private LocalDate actualizado;

    /**
     * Crea un registro de libros de un anio lectivo.
     *
     * @param añoLectivo anio lectivo del registro
     * @param actualizado fecha (texto "dd-MM-yyyy") de la ultima
     * actualizacion
     */
    public RegistroLibros(int id, int añoLectivo, LocalDate actualizado) {
        super(id);
        this.añoLectivo = añoLectivo;
        this.actualizado = actualizado;
    }

    public int getAñoLectivo() {
        return añoLectivo;
    }

    public void setAñoLectivo(int añoLectivo) {
        this.añoLectivo = añoLectivo;
    }

    public LocalDate getActualizado() {
        return actualizado;
    }

    public void setActualizado(LocalDate actualizado) {
        this.actualizado = actualizado;
    }

}
