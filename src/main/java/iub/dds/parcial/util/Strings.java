package iub.dds.parcial.util;

/**
 * Clase de utilidad para las Strings
 * @author brom
 */
public class Strings {
	/**
	 * <p>Hace plural una string</p>
	 * <p>Si termina en vocal, agrega una s, si no, termina en es</p>
	 * <ul>
	 * <li>Gato -> Gatos</li>
	 * <li>Leon -> Leones</li>
	 * </ul>
	 * @param s
	 * @return 
	 */
	public static String pluralizar(String s) {
		return esVocal(ultimoCaracter(s))? s+'s' : s+"es";
	}
	
	public static boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	
	public static char ultimoCaracter(String s) {
		return s.charAt(s.length()-1);
	}
}