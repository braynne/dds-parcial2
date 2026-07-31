package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Cliente;
import static iub.dds.parcial.util.Swing.*;

public class FormCliente extends FormularioBase<Cliente> {
	
	public FormCliente() {
		super(Cliente.class, Datos.instancia().clientes());
	}

	@Override
	protected Cliente crearElemento() {
		return new Cliente(
			getString(fld00),
			getString(fld01),
			getInt(fld02),
			get((s)-> s.charAt(0), fld03, ' '),
			getLong(fld04),
			getString(fld05),
			getString(fld06),
			getString(fld07),
			getString(fld08),
			getLong(fld09)
		);
	}
	
}
