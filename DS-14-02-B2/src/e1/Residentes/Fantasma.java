package e1.Residentes;

public class Fantasma extends e1.Residente {
    float recompensa = horrocrux*80;
    public Fantasma(){}
    @Override
    public String toString() {
        return  nombre + " " + apellido + "(" +
                "Fantasma de " + casa + ", "
                + horrocrux + " horrocruxes" + "): " +
                recompensa + " galeones";
    }
}
