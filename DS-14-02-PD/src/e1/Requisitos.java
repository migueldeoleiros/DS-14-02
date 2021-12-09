package e1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class Requisitos {

    private final List<String> origen;
    private final List<String> destino;
    private final List<Date> fecha;
    private final float precio;

    private Requisitos(Builder builder){
        origen = builder.origen;
        destino = builder.destino;
        fecha = builder.fecha;
        precio = builder.precio;
    }

    public List<String> getOrigen() {return origen;}
    public List<String> getDestino() {return destino;}
    public List<Date> getFecha() {return fecha;}
    public float getPrecio() {return precio;}

    public static class Builder{
        private final List<String> origen = new ArrayList<>();
        private final List<String> destino = new ArrayList<>();
        private final List<Date> fecha = new ArrayList<>();
        private float precio = 0;

        public Builder(){}
        public Builder origen(String... val){
            origen.addAll(Arrays.asList(val));
            return this;
        }
        public Builder destino(String... val){
            destino.addAll(Arrays.asList(val));
            return this;
        }
        public Builder fecha(Date... val){
            fecha.addAll(Arrays.asList(val));
            return this;
        }
        public Builder precio(float val){
            precio=val;
            return this;
        }
        public Requisitos build(){
            return new Requisitos(this);
        }
    }
}
