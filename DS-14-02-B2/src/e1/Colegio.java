package e1;

import e1.Personales.*;

import java.util.ArrayList;

public class Colegio {

    ArrayList<Personal> personales = new ArrayList<>();
    ArrayList<Residente> residentes = new ArrayList<>();

    public Colegio(){}

    private void exceptionTest(int edad, int horrocrux){
        if(edad<=0 || horrocrux <=0)throw new IllegalArgumentException();
    }
    public void addEstudiante(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        e1.Residentes.Estudiante residente = new e1.Residentes.Estudiante();
        exceptionTest(edad,horrocrux);
        residente.set(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }
    public void addFantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        e1.Residentes.Fantasma residente = new e1.Residentes.Fantasma();
        exceptionTest(edad,horrocrux);
        residente.set(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }
    public void addConserje(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        e1.Personales.Conserje personal = new e1.Personales.Conserje();
        exceptionTest(edad,horrocrux);
        personal.set(nombre, apellido, edad, horrocrux, nocturnidad);
        personales.add(personal);
    }
    public void addDocente(String nombre, String apellido, int edad, int horrocrux, Docente.Asignatura asignatura){
        e1.Personales.Docente personal = new e1.Personales.Docente();
        exceptionTest(edad,horrocrux);
        personal.set(nombre, apellido, edad, horrocrux, asignatura);
        personales.add(personal);
    }
    public void addGuardabosque(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        e1.Personales.Guardabosque personal = new e1.Personales.Guardabosque();
        exceptionTest(edad,horrocrux);
        personal.set(nombre, apellido, edad, horrocrux, nocturnidad);
        personales.add(personal);
    }

    public String imprimirRecompensas(){
        StringBuilder output = new StringBuilder();
        float total=0;
        for(Residente i:residentes){
            output.append(i.toString()).append("\n");
            total += i.getRecompensa();
        }
        for(Personal i:personales){
            output.append(i.toString()).append("\n");
            total += i.getRecompensa();
        }
        output.append("La recompensa total del Colegio Howarts es de ")
                .append(total).append(" galeones");

        //System.out.println(output);
        return output.toString();
    }

    public String imprimirSalarios(){
        StringBuilder output = new StringBuilder();
        int total=0;
        for(Personal i: personales){
            output.append(i.toStringSalario()).append("\n");
            total += i.getSalario();
        }
        output.append("El gasto de Howarts en personal es de ")
                .append(total).append(" galeones");

        //System.out.println(output);
        return output.toString();

    }
}