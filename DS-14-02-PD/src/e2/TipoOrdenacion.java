package e2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

interface TipoOrdenacion {
     List<Character> listaDeNodos= new ArrayList<>();
     List<Character> ordenar(Map<Character,List<Character>> nodos);
}

