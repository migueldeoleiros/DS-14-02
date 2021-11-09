package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class PrecioTotalComparator implements Comparator<Anuncio> {     //Comparamos apartamentos en base a la suma
    public int compare(Anuncio obj1, Anuncio obj2){                     //de su precio base+precio de su garaje
        Integer p1;
        int p2;
        p1 = (obj1.apartamento.precioGaraje + obj1.apartamento.precioBase);
        p2 = (obj2.apartamento.precioGaraje + obj2.apartamento.precioBase);
        return p1.compareTo(p2);
    }
}
