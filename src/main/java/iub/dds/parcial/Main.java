package iub.dds.parcial;

import iub.dds.parcial.gui.ButtonInfo;
import iub.dds.parcial.gui.FormCliente;
import iub.dds.parcial.gui.Menu;


public class Main {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		java.awt.EventQueue.invokeLater(() -> new Menu("PARCIAL",
			new ButtonInfo("Clientes", new FormCliente())
		).setVisible(true));
	}
}