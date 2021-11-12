package e1;

import e1.Personales.*;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    private final List<Personal> personales = new ArrayList<>();    //Almacenamos los miembros del colegio que pertenecen al personal
    private final List<Residente> residentes = new ArrayList<>();   //Almacenamos los miembros residentes del colegio
    private final List<Docente.Asignatura> asignaturas = new ArrayList<>(5);

    public Colegio(){}

    /**
     * comprueba al valided de los parametros.
     *
     * @throws IllegalArgumentException si el nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    private void exceptionTest(int edad, int horrocrux, String nombre, String apellido){
        if(nombre==null||apellido==null)throw new IllegalArgumentException();//integrante es valido antes de añadirlo
        if(edad<=0 || horrocrux<0)throw new IllegalArgumentException();
    }

    /**
     * Anade un estudiante a la lista de residentes.
     *
     * @throws IllegalArgumentException si la casa, nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    public void addEstudiante(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(casa==null) throw new IllegalArgumentException();
        e1.Residentes.Estudiante residente = new e1.Residentes.Estudiante(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }

    /**
     * Anade un fantasma a la lista de residentes.
     *
     * @throws IllegalArgumentException si la casa, nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    public void addFantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(casa==null) throw new IllegalArgumentException();
        e1.Residentes.Fantasma residente = new e1.Residentes.Fantasma(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }

    /**
     * Anade un conserje a la lista de personal.
     *
     * @throws IllegalArgumentException si el nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    public void addConserje(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        exceptionTest(edad,horrocrux,nombre,apellido);
        e1.Personales.Conserje personal = new e1.Personales.Conserje(nombre, apellido, edad, horrocrux, nocturnidad);
        personales.add(personal);
    }

    /**
     * Anade un docente a la lista de personal.
     *
     * @throws IllegalArgumentException si el nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    public void addDocente(String nombre, String apellido, int edad, int horrocrux, Docente.Asignatura asignatura){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(asignatura==null) throw new IllegalArgumentException();
        e1.Personales.Docente personal = new e1.Personales.Docente(nombre, apellido, edad, horrocrux, asignatura);
        if(asignaturas.contains(personal.getAsignatura())) throw new IllegalArgumentException();
        asignaturas.add(personal.getAsignatura());
        personales.add(personal);
    }

    /**
     * Anade un guardabosques a la lista de personal.
     *
     * @throws IllegalArgumentException si el nombre o apellido son nulos
     *      o la edad y horrocruxes son menores que 0
     */
    public void addGuardabosque(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        exceptionTest(edad,horrocrux,nombre,apellido);
        e1.Personales.Guardabosque personal = new e1.Personales.Guardabosque(nombre, apellido, edad, horrocrux, nocturnidad);
        personales.add(personal);
    }

    /**
     * Lista de personas con su recompaensa por horrocruxes y la suma total de ellas.
     *
     * @return String con la lista de personas con la recompensa total y para cada uno de ellos
     */
    public String imprimirRecompensas(){
        StringBuilder output = new StringBuilder();
        float total=0;
        for(Residente i:residentes){        //Recorremos la lista de residentes
            output.append(i.toString()).append("\n");
            total += i.getRecompensa();
        }
        for(Personal i:personales){         //Recorremos la lista de personal
            output.append(i.toString()).append("\n");
            total += i.getRecompensa();
        }
        output.append("La recompensa total del Colegio Howarts es de ")
                .append(total).append(" galeones");

        return output.toString();
    }

    /**
     * Lista de personal con su salario y la suma total de ellos.
     *
     * @return String con la lista de personal con el salario total y para cada uno de ellos
     */
    public String imprimirSalarios(){
        StringBuilder output = new StringBuilder();
        int total=0;
        for(Personal i: personales){        //Recorremos la lista de personal
            output.append(i.toStringSalario()).append("\n");
            total += i.getSalario();
        }
        output.append("El gasto de Howarts en personal es de ")
                .append(total).append(" galeones");

        return output.toString();

    }
}
