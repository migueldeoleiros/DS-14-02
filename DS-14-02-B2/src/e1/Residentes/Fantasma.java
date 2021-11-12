package e1.Residentes;

import e1.Residente;

public class Fantasma extends e1.Residente {
    public Fantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa) {
        super.set(nombre, apellido, edad, horrocrux, casa);
        super.setRecompensa(horrocrux*80);
        if(casa == Casa.Slytherin) super.setRecompensa(getRecompensa()*2);
    }

    @Override
    public String toString() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Fantasma de " + super.getCasa() + ", "
                + super.getHorrocrux() + " horrocruxes" + "): " +
                super.getRecompensa() + " galeones";
    }
}
