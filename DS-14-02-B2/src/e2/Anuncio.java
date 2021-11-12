package e2;

import java.util.*;

public class Anuncio implements Comparable<Anuncio>{        //Implementa el interfaz Comparable
    private final Integer referencia;
    private final Apartamento apartamento;

    public Apartamento getApartamento() {
        return apartamento;
    }

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
