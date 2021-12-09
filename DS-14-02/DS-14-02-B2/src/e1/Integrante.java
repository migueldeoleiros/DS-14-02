package e1;

public abstract class Integrante {
    private String nombre;
    private String apellido;
    private int edad;
    private int horrocrux;
    private float recompensa;

    public void set(String nombre, String apellido, int edad, int horrocrux) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horrocrux= horrocrux;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public int getHorrocrux() {
        return horrocrux;
    }

    public float getRecompensa(){return recompensa;}

    public void setRecompensa(float recompensa) {
        this.recompensa = recompensa;
    }
}
