package e2;

import java.util.Objects;

public class Apartamento {
    private final Integer precioBase;
    private final Integer precioGaraje;
    private final Integer metros;
    private final Integer postal;
    private final Integer aseos;
    private final Integer habitaciones;
    private final Integer piso;

    public Integer getPrecioBase() {
        return precioBase;
    }

    public Integer getPrecioGaraje() {
        return precioGaraje;
    }

    public Integer getMetros() {
        return metros;
    }

    public Integer getPostal() {
        return postal;
    }

    public Integer getAseos() {
        return aseos;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public Integer getPiso() {
        return piso;
    }

    public Apartamento(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        this.precioBase = precioBase;
        this.precioGaraje = precioGaraje;
        this.metros = metros;
        this.postal = postal;
        this.aseos = aseos;
        this.habitaciones = habitaciones;
        this.piso = piso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartamento that)) return false;
        return Objects.equals(precioBase, that.precioBase) && Objects.equals(precioGaraje, that.precioGaraje) && Objects.equals(metros, that.metros) && Objects.equals(postal, that.postal) && Objects.equals(aseos, that.aseos) && Objects.equals(habitaciones, that.habitaciones) && Objects.equals(piso, that.piso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precioBase, precioGaraje, metros, postal, aseos, habitaciones, piso);
    }
}
