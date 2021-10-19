package e1;

public class Integrante {
    public String nombre;
    public String apellido;
    public int edad;
    public float recompensa;

    public void setIntegrante(String nombre, String apellido, int edad, float recompensa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.recompensa = recompensa;
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
    public float getRecompensa() {
        return recompensa;
    }
}
