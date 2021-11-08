package e2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gestor {
    List<Anuncio> anuncios= new ArrayList<>();
    private int count=0;

    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        Integer referencia = count; count++;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }
    public List<Anuncio> sort(Comparator<Anuncio> comparator){
        anuncios.sort(comparator);
        return anuncios;
    }
}
