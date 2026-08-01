package iub.dds.parcial.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public class Reflect {

    /**
     * Basado en la clase dada, retornara una lista de sus campos
     */
    public static ArrayList<Field> getFields(Class<?> clazz) {
        var fields = new ArrayList<Field>();
        var hierarchy = new ArrayList<Class<?>>();

        while (clazz != null) {
            hierarchy.add(clazz);
            clazz = clazz.getSuperclass();
        }

        // Iterate from superclass to subclass
        for (int i = hierarchy.size() - 1; i >= 0; i--) {
            for (Field field : hierarchy.get(i).getDeclaredFields()) {
                // ignorar los modificadores "transient" y "static"
                int mods = field.getModifiers();
                if (Modifier.isTransient(mods) || Modifier.isStatic(mods)) {
                    continue;
                }
                field.trySetAccessible(); // para que no de problemas de acceso
                fields.add(field);
            }
        }
        return fields;
    }

    /**
     * segun list y fields, retornar el valor basandose en sus indices
     */
    public static Object getValueAt(final List list, final List<Field> fields, int row, int column) {
        try {
            Object o = list.get(row);
            return fields.get(column).get(o);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return "ERROR!";
        }
    }
}