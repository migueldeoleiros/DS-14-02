package e1.Residentes;

import e1.Residente;

public class Estudiante extends e1.Residente {
    public Estudiante(){}

    @Override
    public void set(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa) {
        super.set(nombre, apellido, edad, horrocrux, casa);
        this.recompensa = horrocrux*90;
        if(casa == Casa.Slytherin) recompensa*=2;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Estudiante de " + casa + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
}

