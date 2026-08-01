package iub.dds.parcial.entidades;

/**
 * Representa un proveedor de libros de la biblioteca (editorial o
 * distribuidor). Un Libro referencia un Proveedor a través del campo
 * idProveedor.
 */
public class Proveedor extends ClaseBase {

    // Razon social (nombre legal) del proveedor
    private String razonSocial;
    // Telefono de contacto del proveedor
    private String telefono;
    // Ciudad donde esta ubicado el proveedor
    private String ciudad;

    /**
     * Crea un proveedor de libros.
     *
     * @param razonSocial nombre legal del proveedor
     * @param telefono telefono de contacto
     * @param ciudad ciudad de ubicacion
     */
    public Proveedor(int id, String razonSocial, String telefono, String ciudad) {
        super(id);
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
