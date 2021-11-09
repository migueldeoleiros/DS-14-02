package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class AseosComparator implements Comparator<Anuncio> {       //Comparamos apartamentos por el numero de aseos
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.aseos.compareTo(obj2.apartamento.aseos);
    }
}
