package e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OrdenJerarq implements TipoOrdenacion{
    @Override
    public List<Character> ordenar(Map<Character, List<Character>> nodos) {
        List<Character> ordenada = new ArrayList<>();
        List<Character> sinPadre = new ArrayList<>();

        Iterator<Character> it = nodos.keySet().iterator();
        while(it.hasNext()){
            for(Character padre : nodos.keySet()) {
                boolean out = false;
                for (List<Character> listHijo : nodos.values()) {
                    for (Character hijo : listHijo) {
                        if (hijo == padre) {
                            out = true;
                            break;
                        }
                    }
                    if (out) break;
                }
                if (!out || sinPadre.contains(padre)) {
                    ordenada.add(padre);
                }
            }
            for(Character i: ordenada){
                if(nodos.get(i) != null)
                    sinPadre.addAll(nodos.get(i));
                nodos.remove(i);
            }
            it = nodos.keySet().iterator();
        }
        return ordenada;
    }
}
