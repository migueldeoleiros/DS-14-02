package e2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gestor {
    List<Anuncio> anuncios= new ArrayList<>();      //Creamos una lista de anuncios
    private int count=0;        //Creamos un contador para el numero de referencia de cada anuncio

    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {       //Añadimos un anuncio a nuestra lista
        Integer referencia = count; count++;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }
    public List<Anuncio> sort(Comparator<Anuncio> comparator){      //Ordenamos nuestra lista segun el criterio del comparador que usemos
        anuncios.sort(comparator);
        return anuncios;
    }
}
