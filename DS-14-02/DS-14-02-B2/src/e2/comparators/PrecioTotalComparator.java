package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class PrecioTotalComparator implements Comparator<Anuncio> {     //Comparamos apartamentos en base a la suma
    public int compare(Anuncio obj1, Anuncio obj2){                     //de su precio base+precio de su garaje
        Integer p1;
        int p2;
        p1 = (obj1.getApartamento().getPrecioGaraje() + obj1.getApartamento().getPrecioBase());
        p2 = (obj2.getApartamento().getPrecioGaraje() + obj2.getApartamento().getPrecioBase());
        return p1.compareTo(p2);
    }
}
