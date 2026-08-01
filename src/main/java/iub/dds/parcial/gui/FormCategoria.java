package iub.dds.parcial.gui;

import iub.dds.parcial.datos.Datos;
import iub.dds.parcial.entidades.Categoria;
import static iub.dds.parcial.util.Swing.*;

/**
 * Formulario concreto para gestionar Categorias. Orden de campos segun
 * Reflect.getFields(Categoria.class): nombre, descripcion.
 */
public class FormCategoria extends FormularioBase<Categoria> {

    public FormCategoria() {
        super(Categoria.class, Datos.instancia().categorias());
    }

    /**
     * Construye una Categoria leyendo los campos del formulario en el orden de
     * declaracion: nombre, descripcion.
     */
    @Override
    protected Categoria crearElemento() {
        return new Categoria(
                getInt(fld00), // id
                getString(fld01), // nombre
                getString(fld02) // descripcion
        );
    }

}
