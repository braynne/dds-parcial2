package iub.dds.parcial.gui;

import java.awt.event.ActionListener;

/**
 * Clase que almacena el nombre y el formulario que ejecuta el boton
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

    public ActionListener getListener() {
        return e -> form.setVisible(true);
    }

}
