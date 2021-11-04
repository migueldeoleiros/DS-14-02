package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gestor {
    List<Anuncio> anuncios= new ArrayList<>();
    private int count=0;

    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        Integer referencia = count; count++;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }
    public List<Anuncio> sort(){
        Collections.sort(anuncios);
        return anuncios;
    }
    public List<Anuncio> sortPrecioBase(){
        anuncios.sort(new PrecioBaseComparator());
        return anuncios;
    }
    public List<Anuncio> sortPrecioTotal() {
        anuncios.sort(new PrecioTotalComparator());
        return anuncios;
    }
    public List<Anuncio> sortAseos() {
        anuncios.sort(new AseosComparator());
        return anuncios;
    }
    public List<Anuncio> sortHabitaciones() {
        anuncios.sort(new HabitacionComparator());
        return anuncios;
    }
}
