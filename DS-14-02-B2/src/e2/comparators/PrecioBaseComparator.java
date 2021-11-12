package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class PrecioBaseComparator implements Comparator<Anuncio> {      //Comparamos apartamentos en funcion a su precio base
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.getApartamento().getPrecioBase().compareTo(obj2.getApartamento().getPrecioBase());
    }
}
