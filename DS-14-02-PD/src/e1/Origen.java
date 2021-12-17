package e1;

import java.util.List;
import java.util.stream.Collectors;

public class Origen implements Componente{
    private final String origen;
    private final List<Billete> listaBilletes;

    public Origen(String origen, List<Billete> listaBilletes){
        this.origen = origen;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        return listaBilletes.stream().filter(Billete -> Billete.origen().equals(this.origen)).collect(Collectors.toList());

    }
}
