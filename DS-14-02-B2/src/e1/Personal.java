package e1;

public abstract class Personal extends Integrante {
    public int salario;

    public float getSalario() {
        return salario;
    }

    public void set(String nombre, String apellido, int edad,int horrocrux) {
        super.set(nombre, apellido, edad, horrocrux);
    }
    public String toStringSalario(){return "";}
}