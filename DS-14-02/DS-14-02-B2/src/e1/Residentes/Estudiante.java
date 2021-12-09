package e1.Residentes;

import e1.Residente;

public class Estudiante extends e1.Residente {
    public Estudiante(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa) {
        super.set(nombre, apellido, edad, horrocrux, casa);
        super.setRecompensa(horrocrux*90);
        if(casa == Casa.Slytherin) super.setRecompensa(getRecompensa()*2);
    }

    @Override
    public String toString() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Estudiante de " + super.getCasa() + ", "
                + super.getHorrocrux() + " horrocruxes" + "): " +
                super.getRecompensa() + " galeones";
    }
}

