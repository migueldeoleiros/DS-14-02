package e2;

import java.util.*;

public class ListaNodos {
    private final Map<Character,List<Character>> nodos= new HashMap<>();
    private TipoOrdenacion ordenacion;

    public void setTipoOrdenacion(TipoOrdenacion ordenacion){
        this.ordenacion=ordenacion;
    }

    public List<Character> ordenar(){
        return ordenacion.ordenar(nodos);
    }

    public void addHijo(char nodo,char hijo) {
        nodos.putIfAbsent(nodo, new ArrayList<>());
        nodos.putIfAbsent(hijo, new ArrayList<>());
        nodos.get(nodo).add(hijo);
    }
}