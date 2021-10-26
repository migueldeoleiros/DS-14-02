package e1.Personales;

public class Conserje extends e1.Personal {
    boolean nocturnidad;

    public Conserje(){}

    public void set(String nombre, String apellido, int edad,int horrocrux, boolean nocturnidad) {
        super.set(nombre, apellido, edad, horrocrux);
        this.nocturnidad=nocturnidad;
        salario=150;
        if(nocturnidad)salario+=10;
        recompensa = horrocrux*65;
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
