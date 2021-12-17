package e1;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class Fecha implements Componente{
    private final Date fecha;
    private final List<Billete> listaBilletes;

    public Fecha(Date fecha, List<Billete> listaBilletes){
        this.fecha = fecha;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        return listaBilletes.stream().filter(Billete -> Billete.fecha().equals(this.fecha)).collect(Collectors.toList());
    }
}
