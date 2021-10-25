package e1.Personales;

public class Guardabosque extends e1.Personal {
    boolean nocturnidad;
    float recompensa = horrocrux*75;

    public Guardabosque(){}

    public void set(String nombre, String apellido, int edad,int horrocrux, int salario, boolean nocturnidad) {
        super.set(nombre, apellido, edad,salario, horrocrux);
        this.nocturnidad=nocturnidad;
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
                "(Guardabosques):" +
                salario + " galeones";
    }
}