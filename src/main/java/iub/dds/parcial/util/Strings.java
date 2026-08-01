package iub.dds.parcial.util;

import java.time.LocalDate;

/**
 * Clase de utilidad para las Strings
 *
 * @author brom
 */
public class Strings {

    /**
     * <p>
     * Hace plural una string</p>
     * <p>
     * Si termina en vocal, agrega una s, si no, termina en es</p>
     * <ul>
     * <li>Gato -> Gatos</li>
     * <li>Leon -> Leones</li>
     * </ul>
     *
     * @param s
     * @return
     */
    public static String pluralizar(String s) {
        return esVocal(ultimoCaracter(s)) ? s + 's' : s + "es";
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static char ultimoCaracter(String s) {
        return s.charAt(s.length() - 1);
    }
    
    public static char toChar(String s) {
        return s.charAt(0);
    }
    
    public static boolean toBoolean(String s) {
        char c = Character.toLowerCase(s.charAt(0));
        return switch (c) {
            case 'f', 'n', '0' -> false;
            case 'y', 's', 't', '1' -> true;
            default -> false;
        };
    }
    
    public static LocalDate toLocalDate(String s) {        
        return LocalDate.parse(s);
    }
}
