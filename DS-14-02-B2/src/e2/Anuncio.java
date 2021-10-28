package e2;

import java.util.*;

public class Anuncio implements Comparable<Anuncio>{
    Integer referencia;
    Apartamento apartamento;

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
class PrecioBaseComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.precioBase.compareTo(obj2.apartamento.precioBase);
    }
}
class PrecioGarajeComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        Integer p1, p2;
        p1 = (obj1.apartamento.precioGaraje + obj1.apartamento.precioBase);
        p2 = (obj2.apartamento.precioGaraje + obj2.apartamento.precioBase);
        return p1.compareTo(p2);
    }
}
class AseosComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.aseos.compareTo(obj2.apartamento.aseos);
    }
}
class HabitacionComparator implements Comparator<Anuncio>{
    public int compare(Anuncio obj1, Anuncio obj2){
        return obj1.apartamento.habitaciones.compareTo(obj2.apartamento.habitaciones);
    }
}
