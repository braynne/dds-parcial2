package iub.dds.parcial.gui;

import java.awt.event.ActionListener;

/**
 * Clase que almacena el nombre y el formulario de un boton
 */
public class ButtonInfo {
	private final String name;
	private final FormularioBase<?> form;
	
	public ButtonInfo(String name, FormularioBase<?> form) {
		this.name = name;
		this.form = form;
	}

	public String getName() {
		return name;
	}

	public FormularioBase<?> getForm() {
		return form;
	}
	
	/**
	 * Convierte el formulario en un ActionListener para darle la accion al botton
	*/
	public ActionListener getListener() {
		return e -> form.setVisible(true);
	}
	
}