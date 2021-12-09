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
    Billete billete1, billete2, billete3, billete4;
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

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
    }
    @Test
    void basicTest(){
        Requisitos requisitos;
        requisitos = new Requisitos.Builder().origen("Coruna","Santiago").precio(43).build();
        gestor.findBillete(requisitos);
    }

}
