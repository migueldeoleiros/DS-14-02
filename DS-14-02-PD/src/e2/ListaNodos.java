package e2;

import java.util.*;

public class ListaNodos {
    private final Map<Character,List<Character>> nodos= new HashMap<>();
    private TipoOrdenacion ordenacion;

    public ListaNodos(){}

    public void setTipoOrdenacion(TipoOrdenacion ordenacion){
        this.ordenacion=ordenacion;
    }

    public TipoOrdenacion getTipoOrdenacion(){
        return ordenacion;
    }

    public List<Character> ordenar(){
        return ordenacion.ordenar(sortbykey());
    }

    public void addHijo(char nodo,char hijo) {
        nodos.putIfAbsent(nodo, new ArrayList<>());
        nodos.putIfAbsent(hijo, new ArrayList<>());
        nodos.get(nodo).add(hijo);
    }

    //Sort map by Key
    private Map<Character,List<Character>> sortbykey() {
        return new TreeMap<>(nodos);
    }
}