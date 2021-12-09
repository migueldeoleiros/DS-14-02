package e1;

import java.util.Date;

public class Billete {
    final String origen;
    final String destino;
    final Date fecha;
    final float precio;

    public Billete(String origen, String destino, Date fecha, float precio) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.precio = precio;
    }
}
