package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class HabitacionesComparator implements Comparator<Anuncio> {
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.habitaciones.compareTo(obj2.apartamento.habitaciones);
    }
}
