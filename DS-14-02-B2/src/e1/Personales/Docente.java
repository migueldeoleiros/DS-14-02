package e1.Personales;

public class Docente extends e1.Personal {
    public enum Asignatura {Defensa,Transformaciones,Pociones,Herbologia,Historia}
    private final Asignatura asignatura;
    public Docente(String nombre, String apellido, int edad,int horrocrux, Asignatura asignatura) {
        super.set(nombre, apellido, edad, horrocrux);
        this.asignatura=asignatura;
        switch(asignatura){
            case Defensa -> salario=500;
            case Transformaciones -> salario=400;
            case Pociones -> salario=350;
            case Herbologia -> salario=250;
            case Historia -> salario=200;
        }
        super.setRecompensa(horrocrux*50);
        if(asignatura == Asignatura.Defensa) super.setRecompensa(getRecompensa()*0.75f);
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    @Override
    public String toString() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Docente de " + asignatura + ", "
                + super.getHorrocrux() + " horrocruxes" + "): " +
                super.getRecompensa() + " galeones";
    }
    @Override
    public String toStringSalario() {
        return  super.getNombre() + " " + super.getApellido() + "(" +
                "Docente de " + asignatura + "): " +
                salario + " galeones";
    }
}
