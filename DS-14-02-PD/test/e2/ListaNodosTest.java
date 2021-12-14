package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListaNodosTest {
    ListaNodos listaNodos1 = new ListaNodos();
    ListaNodos listaNodos2 = new ListaNodos();

    @BeforeEach
    void setUp(){
        listaNodos1.addHijo('C','A');
        listaNodos1.addHijo('C','F');
        listaNodos1.addHijo('A','B');
        listaNodos1.addHijo('A','D');
        listaNodos1.addHijo('B','E');
        listaNodos1.addHijo('D','E');
        listaNodos1.addHijo('F','E');
        listaNodos1.addHijo('G','F');
        listaNodos1.addHijo('G','H');
        listaNodos1.addHijo('F','J');
        listaNodos1.addHijo('H','J');

        listaNodos2.addHijo('J','D');
        listaNodos2.addHijo('A','D');
        listaNodos2.addHijo('A','B');
        listaNodos2.addHijo('G','C');
        listaNodos2.addHijo('D','H');
        listaNodos2.addHijo('C','B');
        listaNodos2.addHijo('H','B');
        listaNodos2.addHijo('H','E');

    }

    @Test
    void ordenarDepFuerte(){
        DepFuerte ordenacionDF = new DepFuerte();
        Character[] arrayOrdenado1 =
                new Character[]{'C', 'A', 'B', 'D', 'G', 'F', 'E', 'H', 'J'};
        Character[] arrayOrdenado2 =
                new Character[]{'A','G','C','J','D','H','B','E'};
        List<Character> listaOrdenada1 = new ArrayList<>(Arrays.asList(arrayOrdenado1));
        List<Character> listaOrdenada2 = new ArrayList<>(Arrays.asList(arrayOrdenado2));

        listaNodos1.setTipoOrdenacion(ordenacionDF);
        assertEquals(listaOrdenada1, listaNodos1.ordenar());
        listaNodos2.setTipoOrdenacion(ordenacionDF);
        assertEquals(listaOrdenada2, listaNodos2.ordenar());
    }

    @Test
    void ordenarDepDebil(){
        DepDebil ordenacionDD = new DepDebil();
        Character[] arrayOrdenado1 =
                new Character[]{'C', 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'J'};
        Character[] arrayOrdenado2 =
                new Character[]{'A','B','D','G','C','H','E','J'};
        List<Character> listaOrdenada1 = new ArrayList<>(Arrays.asList(arrayOrdenado1));
        List<Character> listaOrdenada2 = new ArrayList<>(Arrays.asList(arrayOrdenado2));

        listaNodos1.setTipoOrdenacion(ordenacionDD);
        assertEquals(listaOrdenada1, listaNodos1.ordenar());
        listaNodos2.setTipoOrdenacion(ordenacionDD);
        assertEquals(listaOrdenada2, listaNodos2.ordenar());
    }

    @Test
    void ordenarJerarq(){
        OrdenJerarq ordenacionJ = new OrdenJerarq();
        Character[] arrayOrdenado1 =
                new Character[]{'C', 'G', 'A', 'F', 'H', 'B', 'D', 'E', 'J'};
        Character[] arrayOrdenado2 =
                new Character[]{'A','G','J','B','C','D','H','E'};
        List<Character> listaOrdenada1 = new ArrayList<>(Arrays.asList(arrayOrdenado1));
        List<Character> listaOrdenada2 = new ArrayList<>(Arrays.asList(arrayOrdenado2));

        listaNodos1.setTipoOrdenacion(ordenacionJ);
        assertEquals(listaOrdenada1, listaNodos1.ordenar());
        listaNodos2.setTipoOrdenacion(ordenacionJ);
        assertEquals(listaOrdenada2, listaNodos2.ordenar());

    }
}