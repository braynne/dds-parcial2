package iub.dds.parcial.util;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
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

    private Swing() {
    }

    /**
     * Metodo que limpia el texto de un JTextField o similar (que posea el
     * metodo "setText(String)" de la clase "JTextComponent"
     */
    public static void limpiarTexto(JTextComponent a) {
        a.setText(null);
    }

    /**
     * Metodo que limpia el texto de varios JTextField o similar (que posea el
     * metodo "setText(String)" de la clase "JTextComponent"
     */
    public static void limpiarTexto(JTextComponent[] a) {
        for (int i = 0; i < a.length; i++) {
            limpiarTexto(a[i]);
        }
    }

    /**
     * Retorna el texto del componente
     */
    public static String getString(JTextComponent c) {
        if (c == null) return null;
        return c.getText().strip();
    }

    /**
     * Convierte el texto de un JTextComponent usando la funcion.
     */
    public static <T> T get(Function<String, T> parser, JTextComponent c) {
        String texto = getString(c);
        T t = parser.apply(texto);
        return t;
    }

    /**
     * Convierte el texto de un JTextComponent a long.
     */
    public static long getLong(JTextComponent c) {
        return get(Long::parseLong, c);
    }

    /**
     * Convierte el texto de un JTextComponent a int.
     */
    public static int getInt(JTextComponent c) {
        return get(Integer::parseInt, c);
    }

    /**
     * Convierte el texto de un JTextComponent a double.
     * 0.0.
     */
    public static double getDouble(JTextComponent c) {
        return get(Double::parseDouble, c);
    }
    
    /**
     * Convierte el texto de un JTextComponent a char (primer caracter).
     */
    public static char getChar(JTextComponent c) {
        return get(Strings::toChar, c);
    }
    
    /**
     * Convierte el texto de un JTextComponent a LocalDate.
     */
    public static LocalDate getDate(JTextComponent c) {
        return get(Strings::toLocalDate, c);
    }
    
    /**
     * Convierte el texto de un JTextComponent a boolean.
     */
    public static boolean getBoolean(JTextComponent c) {
        return get(Strings::toBoolean, c);
    }

    /**
     * Hace editable un JTextField y le da un nombre la JLabel
     */
    public static void activar(JTextField fld, JLabel lbl, String nombre) {
        lbl.setText(nombre);
        fld.setEditable(true);
    }

    /**
     * Hace cliqueable un JButton y le da un nombre
     */
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
