package iub.dds.parcial.entidades;

/**
 * Representa una categoría temática de los libros de la biblioteca (ej: novela,
 * ciencia, historia). Un Libro referencia una Categoria a través del campo
 * idCategoria.
 */
public class Categoria extends ClaseBase {

    // Nombre de la categoria (ej: "Novela", "Ciencia Ficcion")
    private String nombre;
    // Descripcion detallada de que tipo de libros contiene esta categoria
    private String descripcion;

    /**
     * Crea una categoria de libros.
     *
     * @param nombreCategoria nombre de la categoria
     * @param descripcion descripcion de la categoria
     */
    public Categoria(int id, String nombreCategoria, String descripcion) {
        super(id);
        this.nombre = nombreCategoria;
        this.descripcion = descripcion;
    }

    public String getNombreCategoria() {
        return nombre;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombre = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
