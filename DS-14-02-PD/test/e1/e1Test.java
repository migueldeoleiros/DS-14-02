package e1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class e1Test {
    List<Billete> billetes = new ArrayList<>();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    Date date2 = new Date();
    Billete billete1, billete2, billete3, billete4, billete5, billete6;
    List<Billete> listaBilletes = new ArrayList<>();

    @BeforeEach
    void setUp() throws ParseException {
        date = formatter.parse("05/01/2022");
        billete1 = new Billete("Coruna", "Santiago", date, 10);
        billetes.add(billete1);
        date = formatter.parse("07/01/2022");
        billete2 = new Billete("Santiago", "Coruna", date, 10);
        billetes.add(billete2);
        date = formatter.parse("10/01/2022");
        billete3 = new Billete("Santiago", "Madrid", date, 40);
        billetes.add(billete3);
        date =formatter.parse("11/01/2022");
        billete4 = new Billete("Coruna", "Madrid", date, 45);
        billetes.add(billete4);
        date =formatter.parse("1/12/2021");
        billete5 = new Billete("Coruna", "Orense", date, 15);
        billetes.add(billete5);
        date =formatter.parse("2/12/2021");
        billete6 = new Billete("Santiago", "Orense", date, 15);
        billetes.add(billete6);

    }
    @Test
    void testOrigen(){
        Componente origen = new Origen("Coruna",billetes);

        List<Billete> out = origen.find(); 

        listaBilletes.add(billete1);
        listaBilletes.add(billete4);
        listaBilletes.add(billete5);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testDestino(){
        Componente destino = new Destino("Madrid",billetes);

        List<Billete> out = destino.find();

        listaBilletes.add(billete3);
        listaBilletes.add(billete4);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testfecha() throws ParseException {
        date =formatter.parse("07/01/2022");
        Componente fecha = new Fecha(date,billetes);

        List<Billete> out = fecha.find();

        listaBilletes.add(billete2);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testPrice(){
        Componente precio = new Precio(43,billetes);
        
        List<Billete> out = precio.find();

        listaBilletes.add(billete1);
        listaBilletes.add(billete2);
        listaBilletes.add(billete3);
        listaBilletes.add(billete5);
        listaBilletes.add(billete6);
        assertEquals(listaBilletes, out);
    }
    @Test
    void testFull() throws ParseException {
        Componente origen = new OR(new Origen("Coruna",billetes), new Origen("Santiago",billetes));
        Componente destino = new Destino("Orense",billetes);
        Componente date1 = new Fecha(formatter.parse("1/12/2021"),billetes);
        Componente date2 = new Fecha(formatter.parse("2/12/2021"),billetes);
        Componente fecha = new OR(date1,date2);
        Componente precio = new Precio(15,billetes);

        Componente out =
            new AND(new AND(new AND(origen,destino),precio),fecha);

        listaBilletes.add(billete5);
        listaBilletes.add(billete6);
        assertEquals(listaBilletes, out.find());
    }
}
