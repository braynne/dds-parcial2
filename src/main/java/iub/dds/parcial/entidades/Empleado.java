package iub.dds.parcial.entidades;

/**
 * Representa un empleado de la Biblioteca Municipal, encargado de gestionar los
 * préstamos y demás labores. Extiende a PersonaBiblioteca para heredar el
 * nombre. Usa el id heredado de ClaseBase como identificador, no crea uno
 * propio. Se relaciona con Prestamo a través del id (idEmpleado).
 */
public class Empleado extends ClaseBase {

    // Nombre del empleado
    private String nombre;
    // Cargo que ocupa el empleado dentro de la biblioteca (ej: bibliotecario)
    private String cargo;
    // Turno de trabajo del empleado (ej: mañana, tarde, noche)
    private int turno;

    /**
     * Crea un empleado con su cargo y turno.
     *
     * @param nombre nombre completo del empleado
     * @param cargo cargo que ocupa dentro de la biblioteca
     * @param turno turno de trabajo asignado
     */
    public Empleado(int id, String nombre, String cargo, int turno) {
        super(id);
        this.nombre = nombre;
        this.cargo = cargo;
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
