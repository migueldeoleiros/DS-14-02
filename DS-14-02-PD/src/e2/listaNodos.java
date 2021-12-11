package e2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listaNodos {
    private final Map<Character,List<Character>> nodos= new HashMap<>();
    private final tipoOrdenacion ordenacion;

    public listaNodos(tipoOrdenacion ordenacion){
        this.ordenacion=ordenacion;
    }

    public tipoOrdenacion getTipoOrdenacion(){
        return ordenacion;
    }

    public List<Character> ordenar(){
        return ordenacion.ordenar(nodos);
    }

    public void addHijo(char nodo,char hijo) {
        nodos.putIfAbsent(nodo, null);
        nodos.get(nodo).add(hijo);
    }
}
