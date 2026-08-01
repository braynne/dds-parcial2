package iub.dds.parcial.entidades;

/**
 * Representa un libro del catálogo de la Biblioteca Municipal. Se relaciona con
 * Categoria, Sala y Proveedor mediante referencias por id (idCategoria, idSala,
 * idProveedor respectivamente), no se guardan los objetos completos para
 * mantener el modelo simple, siguiendo el mismo estilo del resto de entidades
 * del sistema.
 */
public class Libro {

    // Codigo ISBN del libro
    private String isbn;
    // Titulo del libro
    private String titulo;
    // Autor del libro
    private String autor;
    // Editorial que publico el libro
    private String editorial;
    // Anio en que se edito/publico el libro
    private int añoEdicion;

    /**
     * Crea un libro con sus datos y referencias.
     *
     * @param isbn codigo ISBN
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param editorial editorial que lo publico
     * @param añoEdicion anio de edicion
     */
    public Libro(String isbn, String titulo, String autor, String editorial, int añoEdicion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoEdicion = añoEdicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

}
