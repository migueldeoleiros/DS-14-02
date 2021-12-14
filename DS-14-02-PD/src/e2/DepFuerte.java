package e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DepFuerte implements TipoOrdenacion{
    @Override
    public List<Character> ordenar(Map<Character, List<Character>> nodos) {
        List<Character> ordenada = new ArrayList<>();

        for (Character padre : nodos.keySet()) {
            boolean out=false;
            for(List<Character> listHijo : nodos.values()) {
                for (Character hijo : listHijo) {
                    if(hijo == padre) {
                        out=true;break;
                    }
                }
                if(out)break;
            }
            if(!out){
                ordenada.add(padre);
                nodos.remove(padre);
            }
        }
        return ordenada;
    }
}
