package e2;

import java.util.*;

public class Anuncio implements Comparable<Anuncio>{
    Integer referencia;
    Apartamento apartamento;

    public Anuncio(){}
    public Anuncio(Integer referencia, Integer precioBase, Integer precioGaraje, Integer metros, Integer postal, Integer aseos, Integer habitaciones, Integer piso) {
        this.referencia = referencia;
        this.apartamento = new Apartamento(precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
    }

    public int compareTo(Anuncio anuncio){
        return this.referencia.compareTo(anuncio.referencia);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Anuncio anuncio)) return false;
        return apartamento.equals(anuncio.apartamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apartamento);
    }
}
class precioBaseComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.precioBase.compareTo(obj2.apartamento.precioBase);
    }
}
class precioGarajeComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.precioGaraje.compareTo(obj2.apartamento.precioGaraje);
    }
}
