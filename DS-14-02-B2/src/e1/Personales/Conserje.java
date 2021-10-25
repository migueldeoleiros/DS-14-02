package e1.Personales;

public class Conserje extends e1.Personal {
    boolean nocturnidad;
    float recompensa = horrocrux*65;

    public Conserje(){}

    public void set(String nombre, String apellido, int edad,int horrocrux,int salario, boolean nocturnidad) {
        super.set(nombre, apellido, edad,salario, horrocrux);
        this.nocturnidad=nocturnidad;
    }
    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Conserje, " + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }

    @Override
    public String toStringSalario() {
        return  nombre + " " + apellido +
                "(Conserje):" +
                salario + " galeones";
    }
}
