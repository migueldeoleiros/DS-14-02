package e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Destino implements Componente{
    private final String destino;
    private final List<Billete> listaBilletes;

    public Destino(String destino, List<Billete> listaBilletes){
        this.destino = destino;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        for(Billete billete : listaBilletes)
            if(Objects.equals(billete.destino(), destino))
                comparados.add(billete);
        return comparados;
    }
}
