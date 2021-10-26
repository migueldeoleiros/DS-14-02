package e2;

import java.util.Objects;

public class Anuncio {
    int referencia;
    Apartamento apartamento;

    public Anuncio(int referencia, int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        this.referencia = referencia;
        this.apartamento = new Apartamento(precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
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
