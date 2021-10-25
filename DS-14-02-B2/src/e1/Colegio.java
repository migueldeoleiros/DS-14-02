package e1;

import java.util.ArrayList;

public class Colegio {

    ArrayList<Personal> personales = new ArrayList<>();
    ArrayList<Residente> residentes = new ArrayList<>();

    public Colegio(){}

    public void addEstudiante(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        e1.Residentes.Estudiante residente = new e1.Residentes.Estudiante();
        residente.set(nombre, apellido, edad, horrocrux, casa);
//            throw new IllegalArgumentException();
        residentes.add(residente);
    }
    public void addFantasma(String nombre, String apellido, int edad, int horrocrux, Residente.Casa casa){
        e1.Residentes.Fantasma residente = new e1.Residentes.Fantasma();
        residente.set(nombre, apellido, edad, horrocrux, casa);
//            throw new IllegalArgumentException();
        residentes.add(residente);
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

        System.out.println(output);
        return output.toString();
    }

    public String imprimirSalarios(){
        StringBuilder output = new StringBuilder();
        float total=0;
        for(Personal i: personales){
            output.append(i.toStringSalario()).append("\n");
            total += i.getSalario();
        }
        output.append("El gasto de Howarts en persona es de ")
                .append(total).append(" galeones");

        System.out.println(output);
        return output.toString();

    }
}
