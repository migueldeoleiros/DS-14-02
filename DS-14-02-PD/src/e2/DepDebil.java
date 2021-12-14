package e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DepDebil implements TipoOrdenacion{
    @Override
    public List<Character> ordenar(Map<Character, List<Character>> nodos) {
        List<Character> ordenada = new ArrayList<>();
        List<Character> sinPadre = new ArrayList<>();

        Iterator<Character> it = nodos.keySet().iterator();
        while(it.hasNext()){
            Character padre = it.next();
            boolean out=false;
            for(List<Character> listHijo : nodos.values()) {
                for (Character hijo : listHijo) {
                    if(hijo == padre ) {
                        out=true;
                        break;
                    }
                }
            }
            if(!out || sinPadre.contains(padre)){
                ordenada.add(padre);
                sinPadre.addAll(nodos.get(padre));
                it.remove();
                it = nodos.keySet().iterator();
            }
        }
        return ordenada;
    }
}
