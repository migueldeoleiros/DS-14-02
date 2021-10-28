package e2;

import e1.Personales.Docente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {
    private Gestor gestor = new Gestor();
    ArrayList<Anuncio> anuncios= new ArrayList<>();

    @BeforeEach
    void setUp(){
        gestor.addAnuncio(100000,3000,100,15179,2,2,4);
        gestor.addAnuncio(110000,2000,110,15123,2,2,8);
        gestor.addAnuncio(300000,10000,200,13674,2,4,1);
        gestor.addAnuncio(75000,2000,75,32600,1,1,7);
    }

    @Test
    void sortTest(){
        assertEquals(anuncios,gestor.sort());

    }

}
