package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class HabitacionesComparator implements Comparator<Anuncio> {        //Comparamos apartamentos por numero de
    public int compare(Anuncio obj1, Anuncio obj2){                         // habitaciones
        return obj1.getApartamento().getHabitaciones().compareTo(obj2.getApartamento().getHabitaciones());
    }
}
