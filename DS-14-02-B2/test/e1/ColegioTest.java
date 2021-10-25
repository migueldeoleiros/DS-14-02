package e1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColegioTest {
    private Colegio Howarts;
    @BeforeEach
    void setUp(){
        Howarts = new Colegio();
        Howarts.addEstudiante("Hermione", "Granger", 12, 3, Residente.Casa.Gryffindor);
        Howarts.addFantasma("Baron", "Sanguinario", 150, 1, Residente.Casa.Slytherin);
    }
    @Test
    void Recompensa(){

        assertEquals("Hermione Granger(Estudiante de Gryffindor, 3 horrocruxes): 270.0 galeones\n" +
                        "Baron Sanguinario(Fantasma de Slytherin, 1 horrocruxes): 160.0 galeones\n" +
                        "La recompensa total del Colegio Howarts es de 430.0 galeones",
                Howarts.imprimirRecompensas());
    }
}