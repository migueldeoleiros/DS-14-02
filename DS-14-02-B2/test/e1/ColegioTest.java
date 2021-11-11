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
        Howarts.addEstudiante("Juan","Gomez",22,5, Residente.Casa.Hufflepuff);
        Howarts.addFantasma("Lebron","James",36,1, Residente.Casa.Ravenclaw);
        Howarts.addFantasma("Baron", "Sanguinario", 150, 1, Residente.Casa.Slytherin);
        Howarts.addGuardabosque("Rubeus","Hagrid",45,2, true);
        Howarts.addDocente("Minerva","McGonagall",70,1, Docente.Asignatura.Transformaciones);
        Howarts.addDocente("Severus","Snape",50,2, Docente.Asignatura.Defensa);
        Howarts.addConserje("Argus","Filch",65,0, true);
        Howarts.addDocente("Leo","Messi",34,0, Docente.Asignatura.Historia);
        Howarts.addDocente("Usain","Bolt",1200,0, Docente.Asignatura.Pociones);
        Howarts.addDocente("Donald","Trump",72,10, Docente.Asignatura.Herbologia);
    }
    @Test
    void testRecompensa(){
        assertEquals("""
                Hermione Granger(Estudiante de Gryffindor, 3 horrocruxes): 270.0 galeones
                Juan Gomez(Estudiante de Hufflepuff, 5 horrocruxes): 450.0 galeones
                Lebron James(Fantasma de Ravenclaw, 1 horrocruxes): 80.0 galeones
                Baron Sanguinario(Fantasma de Slytherin, 1 horrocruxes): 160.0 galeones
                Rubeus Hagrid(Guardabosques, 2 horrocruxes): 150.0 galeones
                Minerva McGonagall(Docente de Transformaciones, 1 horrocruxes): 50.0 galeones
                Severus Snape(Docente de Defensa, 2 horrocruxes): 75.0 galeones
                Argus Filch(Conserje, 0 horrocruxes): 0.0 galeones
                Leo Messi(Docente de Historia, 0 horrocruxes): 0.0 galeones
                Usain Bolt(Docente de Pociones, 0 horrocruxes): 0.0 galeones
                Donald Trump(Docente de Herbologia, 10 horrocruxes): 500.0 galeones
                La recompensa total del Colegio Howarts es de 1735.0 galeones""",
                Howarts.imprimirRecompensas());
    }
    @Test
    void testSalario(){
        assertEquals("""
                Rubeus Hagrid(Guardabosques): 180 galeones
                Minerva McGonagall(Docente de Transformaciones): 400 galeones
                Severus Snape(Docente de Defensa): 500 galeones
                Argus Filch(Conserje): 160 galeones
                Leo Messi(Docente de Historia): 200 galeones
                Usain Bolt(Docente de Pociones): 350 galeones
                Donald Trump(Docente de Herbologia): 250 galeones
                El gasto de Howarts en personal es de 2040 galeones""",
                Howarts.imprimirSalarios());
    }
    @Test
    void testExceptions(){
        Howarts = new Colegio();
        assertThrows(IllegalArgumentException.class,() ->
            Howarts.addEstudiante("Hermione", "Granger", -12, -3, null));
        assertThrows(IllegalArgumentException.class,() ->
            Howarts.addFantasma("Baron", "Sanguinario", 0, -500, Residente.Casa.Slytherin));
        assertThrows(IllegalArgumentException.class,() ->
            Howarts.addDocente("Severus","Snape",-9797,-2,null));
        assertThrows(IllegalArgumentException.class,() ->
            Howarts.addConserje("Argus",null,0,-9776, true));
        assertThrows(IllegalArgumentException.class,() ->
            Howarts.addGuardabosque(null,"Hagrid",-987,0, true));

        //test para docentes con la misma asignatura
        Howarts.addDocente("Severus","Snape",50,2, Docente.Asignatura.Pociones);
        assertThrows(IllegalArgumentException.class,() ->
                Howarts.addDocente("Minerva","McGonagall",70,1, Docente.Asignatura.Pociones));
    }
}