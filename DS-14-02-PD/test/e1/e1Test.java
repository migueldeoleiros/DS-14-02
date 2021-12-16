package e1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class e1Test {
    List<Billete> ListaBilletes = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    Date date2 = new Date();
    Billete billete1, billete2, billete3, billete4, billete5, billete6;
    List<Billete> listaBilletes = new ArrayList<>();

    @BeforeEach
    void setUp() throws ParseException {
        date = formatter.parse("05/01/2022");
        billete1 = new Billete("Coruna", "Santiago", date, 10);
        listaBilletes.add(billete1);
        date = formatter.parse("07/01/2022");
        billete2 = new Billete("Santiago", "Coruna", date, 10);
        listaBilletes.add(billete2);
        date = formatter.parse("10/01/2022");
        billete3 = new Billete("Santiago", "Madrid", date, 40);
        listaBilletes.add(billete3);
        date =formatter.parse("11/01/2022");
        billete4 = new Billete("Coruna", "Madrid", date, 45);
        listaBilletes.add(billete4);
        date =formatter.parse("1/12/2021");
        billete5 = new Billete("Coruna", "Orense", date, 15);
        listaBilletes.add(billete5);
        date =formatter.parse("2/12/2021");
        billete6 = new Billete("Santiago", "Orense", date, 15);
        listaBilletes.add(billete6);

    }
    @Test
    void testOrigen(){
        Componente origen = new Origen("Coruna",listaBilletes);

        List<Billete> out = origen.find(); 

        listaBilletes.add(billete1);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testDestino(){
        Componente destino = new Destino("Madrid",listaBilletes);

        List<Billete> out = destino.find();

        listaBilletes.add(billete3);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, gestor.findBillete(requisitos));
    }
    @Test
    void testfecha() throws ParseException {
        date =formatter.parse("07/01/2022");
        Componenete fecha = new Fecha(date,listaBilletes);

        List<Billete> out = fecha.find();

        listaBilletes.add(billete2);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testPrice(){
        Componente precio = new Precio(43,listaBilletes);
        
        List<Billete> out = precio.find();

        listaBilletes.add(billete1);
        listaBilletes.add(billete2);
        listaBilletes.add(billete3);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testFull() throws ParseException {
        Componente origen = OR(new Origen("Coruna",listaBilletes), new Origen("Santiago",listaBilletes));
        Componente destino = new Destino("Orense",listaBilletes);
        Componente date1 = new Fecha(formatter.parse("1/12/2021"),listaBilletes);
        Componente date2 = new Fecha(formatter.parse("2/12/2021"),listaBilletes);
        Componente fecha = OR(date1,date2);
        Componente precio = new Precio(15);

        List<Billete> out = 
            AND(AND(AND(origen.find(),destino.find()),precio.find()),fecha.find());

        listaBilletes.add(billete5);
        listaBilletes.add(billete6);
        assertEquals(listaBilletes, out);
    }
}
