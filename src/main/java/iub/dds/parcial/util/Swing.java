package iub.dds.parcial.util;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.JTextComponent;

/**
 * Métodos comunes que usan TODOS los formularios (JFrame) de la aplicación.
 * Antes cada formulario repetía este mismo código (aplicar Nimbus, limpiar
 * campos, mostrar mensajes, convertir texto a número...). Esta clase existe
 * para que ese código exista en un solo lugar (principio DRY: Don't Repeat
 * Yourself). Los formularios solo la llaman, no la modifican.
 */
public final class Swing {
	// Constructor privado: esta clase nunca se instancia, solo se usan sus métodos static.
	private Swing() {}
	
	
	/**
	 * Metodo que limpia el texto de un JTextField o similar (que posea el metodo "setText(String)" de
	 * la clase "JTextComponent"
	 */
	public static void limpiarTexto(JTextComponent a) {
		a.setText(null);
	}
	
	/**
	 * Metodo que limpia el texto de varios JTextField o similar (que posea el metodo "setText(String)" de
	 * la clase "JTextComponent"
	 */
	public static void limpiarTexto(JTextComponent[] a) {
		for (int i = 0; i < a.length; i++) limpiarTexto(a[i]);
	}
	
	/**
	 * Metodo que limpia el texto de varios JTextField o similar (que posea el metodo "setText(String)" de
	 * la clase "JTextComponent"
	 */
	public static void limpiarTexto(JTextComponent a, JTextComponent... b) {
		limpiarTexto(a);
		limpiarTexto(b);
	}
	
	/**
	 * Metodo que limpia el texto de varios JTextField o similar (que posea el metodo "setText(String)" de
	 * la clase "JTextComponent"
	 */
	public static void limpiarTexto(List<JTextComponent> l) {
		l.forEach(Swing::limpiarTexto);
	}

    /**
     * Aplica el Look and Feel Nimbus si está disponible. Se llama desde el
     * main() de cada ventana en vez de repetir el mismo bloque try/catch.
     */
    public static void aplicarNimbus(Logger logger) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | UnsupportedLookAndFeelException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
    }
	
	/** Retorna el texto del componente */
	public static String getString(JTextComponent c) {
		if (c == null) return null;
		return c.getText().strip();
	}
	
	/** Convierte el texto de un JTextComponent usando la funcion. */
	public static <T> T get(Function<String, T> parser, JTextComponent c, T emptyValue) {
		String texto = getString(c);
		if (texto.isBlank()) return emptyValue;
		T t = parser.apply(texto);
		return t;
	}

    /** Convierte el texto de un JTextComponent a long; si está vacío devuelve 0. */
    public static long getLong(JTextComponent c) {
		return get(Long::parseLong, c, 0l);
    }

    /** Convierte el texto de un JTextComponent a int; si está vacío devuelve 0. */
    public static int getInt(JTextComponent c) {
       return get(Integer::parseInt, c, 0);
    }

    /** Convierte el texto de un JTextComponent a double; si está vacío devuelve 0.0. */
    public static double getDouble(JTextComponent c) {
        return get(Double::parseDouble, c, 0.0);
    }

    /** true si alguno de los campos obligatorios está vacío. */
    public static boolean hayCamposVacios(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText() == null || campo.getText().isBlank()) {
                return true;
            }
        }
        return false;
    }
	
	/** Hace editable un JTextField y le da un nombre la JLabel */
	public static void activar(JTextField fld, JLabel lbl, String nombre) {
		lbl.setText(nombre);
		fld.setEditable(true);
	}
	
	/** Hace cliqueable un JButton, le da un nombre y le agrega un action listener */
	public static void activar(JButton btn, String nombre, ActionListener listener) {
		btn.setText(nombre);
		btn.setEnabled(true);
		btn.addActionListener(listener);
	}

    public static void mostrarInfo(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarAdvert(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarError(Component padre, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(padre, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

}

