package e2.comparators;

import e2.Anuncio;

import java.util.Comparator;

public class PrecioBaseComparator implements Comparator<Anuncio> {      //Comparamos apartamentos en funcion a su precio base
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.precioBase.compareTo(obj2.apartamento.precioBase);
    }
}
