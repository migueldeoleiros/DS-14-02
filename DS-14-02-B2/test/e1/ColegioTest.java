package e1;

import e1.Personales.Docente;
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
        Howarts.addGuardabosque("Rubeus","Hagrid",45,2, true);
        Howarts.addDocente("Minerva","McGonagall",70,1, Docente.Asignatura.Transformaciones);
        Howarts.addDocente("Severus","Snape",50,2, Docente.Asignatura.Defensa);
        Howarts.addConserje("Argus","Filch",65,0, false);
    }
    @Test
    void Recompensa(){

        assertEquals("""
                        Hermione Granger(Estudiante de Gryffindor, 3 horrocruxes): 270.0 galeones
                        Baron Sanguinario(Fantasma de Slytherin, 1 horrocruxes): 160.0 galeones
                        Rubeus Hagrid(Guardabosques, 2 horrocruxes): 150.0 galeones
                        Minerva McGonagall(Docente de Transformaciones, 1 horrocruxes): 50.0 galeones
                        Severus Snape(Docente de Defensa, 2 horrocruxes): 75.0 galeones
                        Argus Filch(Conserje, 0 horrocruxes): 0.0 galeones
                        La recompensa total del Colegio Howarts es de 705.0 galeones""",
                Howarts.imprimirRecompensas());
    }
}