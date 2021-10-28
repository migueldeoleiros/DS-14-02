package e2;

import java.util.ArrayList;
import java.util.Collections;

public class Gestor {
    ArrayList<Anuncio> anuncios= new ArrayList<>();
    private int count=0;

    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        Integer referencia = count; count++;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }
    public ArrayList<Anuncio> sort(){
        Collections.sort(anuncios);
        //Collections.sort(anuncios,precioBaseComparator.compare());
        return anuncios;
    }
}
