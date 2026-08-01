package iub.dds.parcial.entidades;

/**
 * Representa un lector de la Biblioteca Municipal, es decir, la persona que
 * pide libros prestados o reservados. Extiende a PersonaBiblioteca para heredar
 * el nombre. Se relaciona con Prestamo y Reserva a través del id (idLector).
 */
public class Lector extends ClaseBase {

    // Nombre completo del lector
    private String nombreCompleto;
    // Numero de documento de identidad del lector
    private long documento;
    // Correo electronico de contacto del lector
    private String correo;
    // Numero de telefono de contacto del lector
    private long telefono;

    /**
     * Crea un lector con sus datos de contacto.
     *
     * @param nombreCompleto nombre completo del lector
     * @param documento numero de documento de identidad
     * @param correo correo electronico de contacto
     * @param telefono telefono de contacto
     */
    public Lector(int id, String nombreCompleto, long documento, String correo, long telefono) {
        super(id);
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    

}
