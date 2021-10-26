package e1.Personales;

public class Guardabosque extends e1.Personal {
    boolean nocturnidad;

    public Guardabosque(){}

    public void set(String nombre, String apellido, int edad,int horrocrux, boolean nocturnidad) {
        super.set(nombre, apellido, edad, horrocrux);
        this.nocturnidad=nocturnidad;
        salario=170;
        if(nocturnidad)salario+=10;
        recompensa = horrocrux*75;
    }
    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Guardabosques, " + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
    @Override
    public String toStringSalario() {
        return  nombre + " " + apellido +
                "(Guardabosques): " +
                salario + " galeones";
    }
}