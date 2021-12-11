package e1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {
    Gestor gestor = new Gestor();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    Date date2 = new Date();
    Billete billete1, billete2, billete3, billete4;
    List<Billete> listaBilletes = new ArrayList<>();

    @BeforeEach
    void setUp() throws ParseException {
        date = formatter.parse("05/01/2022");
        billete1 = new Billete("Coruna", "Santiago", date, 10);
        date = formatter.parse("07/01/2022");
        billete2 = new Billete("Santiago", "Coruna", date, 10);
        date = formatter.parse("10/01/2022");
        billete3 = new Billete("Santiago", "Madrid", date, 40);
        date =formatter.parse("11/01/2022");
        billete4 = new Billete("Coruna", "Madrid", date, 45);

        gestor.addBillete(billete1,billete2,billete3,billete4);
    }
    @Test
    void testOrigen(){
        Requisitos requisitos;
        requisitos = new Requisitos.Builder().origen("Coruna").build();

        listaBilletes.add(billete1);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
    @Test
    void testDestino(){
        Requisitos requisitos;
        requisitos = new Requisitos.Builder().destino("Madrid").build();

        listaBilletes.add(billete3);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
    @Test
    void testfecha() throws ParseException {
        Requisitos requisitos;
        date =formatter.parse("07/01/2022");
        requisitos = new Requisitos.Builder().fecha(date).build();

        listaBilletes.add(billete2);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
    @Test
    void testPrice(){
        Requisitos requisitos;
        requisitos = new Requisitos.Builder().precio(43).build();

        listaBilletes.add(billete1);
        listaBilletes.add(billete2);
        listaBilletes.add(billete3);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
    @Test
    void fullTest() throws ParseException {
        Requisitos requisitos;
        date = formatter.parse("11/01/2022");
        date2 = formatter.parse("10/01/2022");
        requisitos = new Requisitos.Builder()
                .origen("Coruna","Santiago").destino("Madrid").precio(50).fecha(date,date2).build();

        listaBilletes.add(billete3);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
}
