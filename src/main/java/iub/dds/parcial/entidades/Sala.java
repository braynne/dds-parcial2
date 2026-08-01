package iub.dds.parcial.entidades;

/**
 * Representa una sala física de la biblioteca donde se ubican los libros. Un
 * Libro referencia una Sala a través del campo idSala.
 */
public class Sala extends ClaseBase {

    // Nombre de la sala (ej: "Sala Infantil", "Sala de Consulta")
    private String nombre;
    // Piso del edificio en el que se encuentra la sala
    private int piso;
    // Numero del estante dentro de la sala
    private int estante;

    /**
     * Crea una sala de la biblioteca.
     *
     * @param nombre nombre de la sala
     * @param piso piso donde se encuentra
     * @param estante numero de estante dentro de la sala
     */
    public Sala(int id, String nombre, int piso, int estante) {
        super(id);
        this.nombre = nombre;
        this.piso = piso;
        this.estante = estante;
    }

    public String getNombreSala() {
        return nombre;
    }

    public void setNombreSala(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumeroEstante() {
        return estante;
    }

    public void setNumeroEstante(int estante) {
        this.estante = estante;
    }

}
