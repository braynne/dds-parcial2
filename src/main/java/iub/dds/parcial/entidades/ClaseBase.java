package iub.dds.parcial.entidades;

/**
 * Clase base para las entidades del sistema. Da un id para casi todas las clases
 * (lo asigna el repositorio al guardar) y métodos comunes.
 */
public class ClaseBase {
    private int id;

    public ClaseBase(int id) {
        this.id = id;
    }
    
    public void guardar() {
        System.out.println("Se está guardando");
    }

    public void eliminar() {
        System.out.println("Se está cerrando");
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
