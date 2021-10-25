package e1.Personales;

public class Docente extends e1.Personal {
    enum Asignatura {Defensa,Transformaciones,Pociones,Herbologia,Historia}
    Asignatura asignatura;
    float recompensa = horrocrux*50;

    public Docente(){}

    public void set(String nombre, String apellido, int edad,int horrocrux, int salario, Asignatura asignatura) {
        super.set(nombre, apellido, edad,salario, horrocrux);
        this.asignatura=asignatura;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Docente de " + asignatura + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
    @Override
    public String toStringSalario() {
        return  nombre + " " + apellido +
                "Docente de " + asignatura + "):" +
                salario + " galeones";
    }
}
