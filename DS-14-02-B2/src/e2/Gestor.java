package e2;

import java.util.ArrayList;

public class Gestor {
    ArrayList<Anuncio> anuncios= new ArrayList<>();

    public void addAnuncio(int precioBase, int precioGaraje, int metros, int postal, int aseos, int habitaciones, int piso) {
        int referencia = 0;
        Anuncio anuncio = new Anuncio(referencia,precioBase,precioGaraje,metros,postal,aseos,habitaciones,piso);
        anuncios.add(anuncio);
    }
}
