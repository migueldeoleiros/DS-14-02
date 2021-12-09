package e1.Personales;

public class Conserje extends e1.Personal {
    public Conserje(String nombre, String apellido, int edad,int horrocrux, boolean nocturnidad) {
        super.set(nombre, apellido, edad, horrocrux);
        salario=150;
        if(nocturnidad)salario+=10;
        super.setRecompensa( horrocrux*65);
    }

    @Override
    public String toString() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Conserje, " + super.getHorrocrux() + " horrocruxes" + "): " +
                super.getRecompensa() + " galeones";
    }

    @Override
    public String toStringSalario() {
        return  super.getNombre() + " " + super.getApellido() +
                "(Conserje): " +
                salario + " galeones";
    }
}
