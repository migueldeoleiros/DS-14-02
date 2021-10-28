package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {
    Gestor gestor = new Gestor();
    Anuncio anuncio1, anuncio2, anuncio3, anuncio4;
    ArrayList<Anuncio> anuncios= new ArrayList<>();
    ArrayList<Anuncio> anunciosSortedBase= new ArrayList<>();
    ArrayList<Anuncio> anunciosSortedGaraje= new ArrayList<>();
    ArrayList<Anuncio> anunciosSortedAseos= new ArrayList<>();
    ArrayList<Anuncio> anunciosSortedHabitaciones= new ArrayList<>();

    @BeforeEach
    void setUp(){
        anuncio1 = new Anuncio(0,100000,13000,100,15179,2,3,4);
        anuncio2 = new Anuncio(0,110000,2000,110,15123,3,2,8);
        anuncio3 = new Anuncio(0,300000,10000,200,13674,2,4,1);
        anuncio4 = new Anuncio(0,75000,1000,75,32600,1,1,7);

        gestor.addAnuncio(100000,13000,100,15179,2,3,4);
        gestor.addAnuncio(110000,2000,110,15123,3,2,8);
        gestor.addAnuncio(300000,10000,200,13674,2,4,1);
        gestor.addAnuncio(75000,1000,75,32600,1,1,7);

        anuncios.add(anuncio1);
        anuncios.add(anuncio2);
        anuncios.add(anuncio3);
        anuncios.add(anuncio4);

        anunciosSortedBase.add(anuncio4);
        anunciosSortedBase.add(anuncio1);
        anunciosSortedBase.add(anuncio2);
        anunciosSortedBase.add(anuncio3);

        anunciosSortedGaraje.add(anuncio4);
        anunciosSortedGaraje.add(anuncio2);
        anunciosSortedGaraje.add(anuncio1);
        anunciosSortedGaraje.add(anuncio3);

        anunciosSortedAseos.add(anuncio4);
        anunciosSortedAseos.add(anuncio1);
        anunciosSortedAseos.add(anuncio3);
        anunciosSortedAseos.add(anuncio2);

        anunciosSortedHabitaciones.add(anuncio4);
        anunciosSortedHabitaciones.add(anuncio2);
        anunciosSortedHabitaciones.add(anuncio1);
        anunciosSortedHabitaciones.add(anuncio3);
    }

    @Test
    void sortTest(){
        assertEquals(anuncios,gestor.sort());
        assertEquals(anunciosSortedBase,gestor.sortPrecioBase());
        assertEquals(anunciosSortedGaraje,gestor.sortPrecioGaraje());
        assertEquals(anunciosSortedAseos,gestor.sortAseos());
        assertEquals(anunciosSortedHabitaciones,gestor.sortHabitaciones());
    }

}
