package e1;

public abstract class Personal extends Integrante {
    public float salario;

    public float getSalario() {
        return salario;
    }

    public void set(String nombre, String apellido, int edad,int horrocrux, int salario) {
        super.set(nombre, apellido, edad, horrocrux);
        this.salario=salario;
    }
    public String toStringSalario(){return "";}
}