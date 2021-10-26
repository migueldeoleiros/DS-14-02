package e1.Residentes;

import e1.Residente;

public class Fantasma extends e1.Residente {
    public Fantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa) {
        super.set(nombre, apellido, edad, horrocrux, casa);
        this.recompensa = horrocrux*80;
        if(casa == Casa.Slytherin) recompensa*=2;
    }
    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Fantasma de " + casa + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
}
