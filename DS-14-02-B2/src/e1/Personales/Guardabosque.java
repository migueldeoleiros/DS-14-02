package e1.Personales;

public class Guardabosque extends e1.Personal {
    public Guardabosque(String nombre, String apellido, int edad,int horrocrux, boolean nocturnidad) {
        super.set(nombre, apellido, edad, horrocrux);
        salario=170;
        if(nocturnidad)salario+=10;
        super.setRecompensa( horrocrux*75);
    }

    @Override
    public String toString() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Guardabosques, " + super.getHorrocrux() + " horrocruxes" + "): " +
                super.getRecompensa() + " galeones";
    }

    @Override
    public String toStringSalario() {
        return  super.getNombre() + " " + super.getApellido() +
                "(Guardabosques): " +
                salario + " galeones";
    }
}