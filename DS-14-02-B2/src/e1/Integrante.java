package e1;

public abstract class Integrante {
    public String nombre;
    public String apellido;
    public int edad;
    public int horrocrux;
    public float recompensa;

    public void set(String nombre, String apellido, int edad, int horrocrux) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horrocrux= horrocrux;
    }

    public float getRecompensa(){return recompensa;}
}
