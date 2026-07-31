package iub.dds.parcial.entidades;

/**
 * Representa un cliente de TuParty. Extiende a Persona para tener nombre, apellido, edad, sexo, etc
 * para no repetir parametros en clases similares
 */
public class Cliente extends Persona {
	
    private String direccion;
    private String nacionalidad;
    private String tipoDocumento;
    private long documento;

	public Cliente(String nombre, String apellido, int edad, char sexo, long telefono, String correo, String direccion, String nacionalidad, String tipoDocumento, long documento) {
		super(nombre, apellido, edad, sexo, telefono, correo);
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}
	
	
	
}
