package iub.dds.parcial.util;

import iub.dds.parcial.util.Reflect;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Un modelo de tabla que usa refleccion para conseguir los valores de la tabla
 *
 * @author brom
 */
public class XTableModel extends AbstractTableModel {

    /**
     * La lista de objetos que va a mostrar
     */
    public List<?> list;
    /**
     * La lista de campos de la clase
     */
    public List<Field> fields;

    /**
     * @param <T> El tipo de dato de los elementos, asegura que List<T> y
     * Class<T> sean del mismo tipo
     * @param list La lista de entidades
     * @param clazz La clase de la entidad
     */
    public <T> XTableModel(List<T> list, Class<T> clazz) {
        this.list = list;
        this.fields = Reflect.getFields(clazz);
    }

    public XTableModel(List<?> list, List<Field> fields) {
        this.list = list;
        this.fields = fields;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return fields.size();
    }

    @Override
    public String getColumnName(int column) {
        return fields.get(column).getName();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return Reflect.getValueAt(list, fields, rowIndex, columnIndex);
    }

}
