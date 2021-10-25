package e1;

public abstract class Residente extends Integrante{
    enum Casa {Gryffindor, Hufflepuff, Ravenclaw, Slytherin}
    public Casa casa;

    public Casa getCasa() {
        return casa;
    }

    public void set(String nombre, String apellido, int edad,int horrocrux, Casa casa) {
        super.set(nombre, apellido, edad, horrocrux);
        this.casa=casa;
    }
}
