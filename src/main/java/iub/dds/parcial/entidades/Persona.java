package iub.dds.parcial.entidades;


/**
 * Clase base para las entidades del sistema. Da un id autoincremental
 * (lo asigna el repositorio al guardar) y métodos comunes.
 */
public class Persona extends ClaseBase {
	
	private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
	private long telefono;
	private String correo;

	public Persona(String nombre, String apellido, int edad, char sexo, long telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sexo = sexo;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}