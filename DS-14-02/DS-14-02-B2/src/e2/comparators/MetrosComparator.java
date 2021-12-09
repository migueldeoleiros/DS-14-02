package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class MetrosComparator implements Comparator<Anuncio> {      //Comparamos apartamentos por su tamaño en metros
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.getApartamento().getMetros().compareTo(obj2.getApartamento().getMetros());
    }
}
