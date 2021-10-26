package e1.Personales;

import e1.Residente;

public class Docente extends e1.Personal {
    public enum Asignatura {Defensa,Transformaciones,Pociones,Herbologia,Historia}
    Asignatura asignatura;
    public Docente(String nombre, String apellido, int edad,int horrocrux, Asignatura asignatura) {
        super.set(nombre, apellido, edad, horrocrux);
        this.asignatura=asignatura;
        switch(asignatura){
            case Defensa -> salario=500;
            case Transformaciones -> salario=400;
            case Pociones -> salario=350;
            case Herbologia -> salario=250;
            case Historia -> salario=200;
        }
        recompensa = horrocrux*50;
        if(asignatura == Asignatura.Defensa) recompensa*=0.75;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Docente de " + asignatura + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
    @Override
    public String toStringSalario() {
        return  nombre + " " + apellido + "(" +
                "Docente de " + asignatura + "): " +
                salario + " galeones";
    }
}
