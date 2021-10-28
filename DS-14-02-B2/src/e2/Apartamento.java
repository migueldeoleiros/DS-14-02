package e2;

import java.util.Objects;

public class Apartamento {
    Integer precioBase;
    Integer precioGaraje;
    Integer metros;
    Integer postal;
    Integer aseos;
    Integer habitaciones;
    Integer piso;

    public Apartamento(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        this.precioBase = precioBase;
        this.precioGaraje = precioGaraje;
        this.metros = metros;
        this.postal = postal;
        this.aseos = aseos;
        this.habitaciones = habitaciones;
        this.piso = piso;
    }

    public int getPrecioBase() {
        return precioBase;
    }
    public int getPrecioGaraje() {
        return precioGaraje;
    }
    public int getMetros() {
        return metros;
    }
    public int getPostal() {
        return postal;
    }
    public int getAseos() {
        return aseos;
    }
    public int getHabitaciones() {
        return habitaciones;
    }
    public int getPiso() {
        return piso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartamento that)) return false;
        return precioBase == that.precioBase && precioGaraje == that.precioGaraje && metros == that.metros && postal == that.postal && aseos == that.aseos && habitaciones == that.habitaciones && piso == that.piso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioBase, precioGaraje, metros, postal, aseos, habitaciones, piso);
    }
}
