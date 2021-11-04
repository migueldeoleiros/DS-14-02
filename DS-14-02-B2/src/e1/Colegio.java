package e1;

import e1.Personales.*;

import java.util.ArrayList;
import java.util.List;

public class Colegio {

    List<Personal> personales = new ArrayList<>();
    List<Residente> residentes = new ArrayList<>();

    public Colegio(){}

    private void exceptionTest(int edad, int horrocrux, String nombre, String apellido){
        if(nombre==null||apellido==null)throw new IllegalArgumentException();
        if(edad<=0 || horrocrux<0)throw new IllegalArgumentException();
    }
    public void addEstudiante(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(casa==null) throw new IllegalArgumentException();
        e1.Residentes.Estudiante residente = new e1.Residentes.Estudiante(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }
    public void addFantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(casa==null) throw new IllegalArgumentException();
        e1.Residentes.Fantasma residente = new e1.Residentes.Fantasma(nombre, apellido, edad, horrocrux, casa);
        residentes.add(residente);
    }
    public void addConserje(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        exceptionTest(edad,horrocrux,nombre,apellido);
        e1.Personales.Conserje personal = new e1.Personales.Conserje(nombre, apellido, edad, horrocrux, nocturnidad);
        personales.add(personal);
    }
    public void addDocente(String nombre, String apellido, int edad, int horrocrux, Docente.Asignatura asignatura){
        exceptionTest(edad,horrocrux,nombre,apellido);
        if(asignatura==null) throw new IllegalArgumentException();
        e1.Personales.Docente personal = new e1.Personales.Docente(nombre, apellido, edad, horrocrux, asignatura);
        personales.add(personal);
    }
    public void addGuardabosque(String nombre, String apellido, int edad, int horrocrux, boolean nocturnidad){
        exceptionTest(edad,horrocrux,nombre,apellido);
        e1.Personales.Guardabosque personal = new e1.Personales.Guardabosque(nombre, apellido, edad, horrocrux, nocturnidad);
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
