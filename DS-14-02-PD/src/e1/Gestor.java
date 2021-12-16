package e1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Gestor {
    private final List<Billete> billetes = new ArrayList<>();

    public void addBillete(Billete... billete){
        billetes.addAll(Arrays.asList(billete));
    }

    public List<Billete> findBillete(Requisitos requisitos){
        List<Billete> resultado = new ArrayList<>();
        for(Billete billete : billetes){
            boolean or=false,dest=false,fec=false,pre=false;
            if(!requisitos.getOrigen().isEmpty()){
                for(String origen : requisitos.getOrigen())
                    if (billete.origen().equals(origen)) {
                        or = true;
                        break;
                    }
            }else or=true;
            if(!requisitos.getDestino().isEmpty()) {
                for (String destino : requisitos.getDestino())
                    if (billete.destino().equals(destino)) {
                        dest = true;
                        break;
                    }
            }else dest=true;
            if(!requisitos.getFecha().isEmpty()) {
                for (Date fecha : requisitos.getFecha())
                    if (billete.fecha().equals(fecha)) {
                        fec = true;
                        break;
                    }
            }else fec=true;
            if(requisitos.getPrecio() == 0 || billete.precio() <= requisitos.getPrecio())
                pre=true;

            if(or&&dest&&fec&&pre) resultado.add(billete);
        }
        return resultado;
    }
}