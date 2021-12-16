package e1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fecha implements Componente{
    private final Date fecha;
    private final List<Billete> listaBilletes;

    public Fecha(Date fecha, List<Billete> listaBilletes){
        this.fecha = fecha;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        for(Billete billete : listaBilletes)
            if(billete.fecha().equals(fecha))
                comparados.add(billete);
        return comparados;
    }
}
