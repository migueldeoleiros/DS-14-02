package e1.Residentes;

public class Estudiante extends e1.Residente {
    float recompensa = horrocrux*90;
    public Estudiante(){}
    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Estudiante de " + casa + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
}

