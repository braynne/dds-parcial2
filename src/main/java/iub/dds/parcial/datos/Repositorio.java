package iub.dds.parcial.datos;

import iub.dds.parcial.entidades.ClaseBase;
import java.util.ArrayList;
import java.util.List;

/**
 * Repositorio genérico en memoria para cualquier entidad que herede de
 * ClaseBase. Guarda la lógica de agregar/listar/contar en un solo lugar
 * (DRY); cada entidad concreta solo necesita una clase pequeña que
 * extienda Repo&lt;SuEntidad&gt;.
 *
 * @param <T> el tipo de entidad que guarda este repositorio.
 */
public class Repositorio<T> {
    private final List<T> elementos = new ArrayList<>();
	
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
	
    public List<T> elementos() {
        return elementos;
    }
	
    public int tamaño() {
        return elementos.size();
    }
}