package e2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListaNodosTest {
    ListaNodos listaNodos = new ListaNodos();

    @BeforeEach
    void setUp(){
        listaNodos.addHijo('C','A');
        listaNodos.addHijo('C','F');
        listaNodos.addHijo('A','B');
        listaNodos.addHijo('A','D');
        listaNodos.addHijo('B','E');
        listaNodos.addHijo('D','E');
        listaNodos.addHijo('F','E');
        listaNodos.addHijo('G','F');
        listaNodos.addHijo('G','H');
        listaNodos.addHijo('F','J');
        listaNodos.addHijo('H','J');
    }

    @Test
    void ordenarDepFuerte(){
        DepFuerte ordenacionDF = new DepFuerte();
        Character[] arrayOrdenado =
                new Character[]{'C', 'A', 'B', 'D', 'G', 'F', 'E', 'H', 'J'};
        List<Character> listaOrdenada = new ArrayList<>(Arrays.asList(arrayOrdenado));

        listaNodos.setTipoOrdenacion(ordenacionDF);
        assertEquals(listaOrdenada,listaNodos.ordenar());
    }

    @Test
    void ordenarDepDebil(){
        DepDebil ordenacionDD = new DepDebil();
        Character[] arrayOrdenado =
                new Character[]{'C', 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'J'};
        List<Character> listaOrdenada = new ArrayList<>(Arrays.asList(arrayOrdenado));

        listaNodos.setTipoOrdenacion(ordenacionDD);
        assertEquals(listaOrdenada,listaNodos.ordenar());
    }

    @Test
    void ordenarJerarq(){
        OrdenJerarq ordenacionJ = new OrdenJerarq();
        Character[] arrayOrdenado =
                new Character[]{'C', 'G', 'A', 'F', 'H', 'B', 'D', 'E', 'J'};
        List<Character> listaOrdenada = new ArrayList<>(Arrays.asList(arrayOrdenado));

        listaNodos.setTipoOrdenacion(ordenacionJ);
        assertEquals(listaOrdenada,listaNodos.ordenar());
    }
}