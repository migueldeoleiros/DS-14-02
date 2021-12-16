package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Origen implements Componente{
    private final String origen;
    private final List<Billete> listaBilletes;

    public Origen(String origen, List<Billete> listaBilletes){
        this.origen = origen;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        for(Billete billete : listaBilletes)
            if(Objects.equals(billete.origen(), origen))
                comparados.add(billete);
        return comparados;
    }
}
