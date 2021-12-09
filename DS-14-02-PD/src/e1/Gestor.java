package e1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gestor {
    List<Billete> billetes = new ArrayList<>();

    public List<Billete> findBillete(Requisitos requisitos){
        List<Billete> resultado = new ArrayList<>();
        for(Billete billete : billetes){
            for(String origen : requisitos.getOrigen())
                if(!billete.origen.equals(origen)) break;
            for(String destino : requisitos.getDestino())
                if(!billete.destino.equals(destino)) break;
            for(Date fecha : requisitos.getFecha())
                if(billete.fecha != fecha) break;
            if(billete.precio <= requisitos.getPrecio())
                resultado.add(billete);
        }
        return resultado;
    }

}