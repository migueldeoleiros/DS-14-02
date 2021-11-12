package e2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Gestor {
    private Comparator<Anuncio> comparator=null;
    private final List<Anuncio> anuncios= new ArrayList<>();      //Creamos una lista de anuncios
    private int count=0;        //Creamos un contador para el numero de referencia de cada anuncio

    /**
     * Asigna el criterio de ordenacion.
     * @param comparator el comparador con el criterio a ordenar
     */
    public void setComparator(Comparator<Anuncio> comparator){
        this.comparator=comparator;
    }

    /**
     * comprueba al validez de los parametros.
     * @throws IllegalArgumentException si cualquiera de los valores es menor que 0
     */
    private void exceptionTest(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones) {
        if(precioBase<=0 || precioGaraje<0 || metros<0 || postal<0 || aseos<0 || habitaciones<0)throw new IllegalArgumentException();
    }

    /**
     * Anade un anuncio nuevo a la base de datos.
     * @throws IllegalArgumentException si cualquiera de los valores es menor que 0 menos el piso
     */
    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        exceptionTest(precioBase,precioGaraje,metros,postal,aseos,habitaciones);
        Integer referencia = count; count++;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }

    /**
     * Ordenamos nuestra lista segun el criterio del comparador que usemos
     */
    public List<Anuncio> sort(){
        anuncios.sort(comparator);
        return anuncios;
    }
}
