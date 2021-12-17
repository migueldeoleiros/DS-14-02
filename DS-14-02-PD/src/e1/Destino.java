package e1;

import java.util.List;
import java.util.stream.Collectors;

public class Destino implements Componente{
    private final String destino;
    private final List<Billete> listaBilletes;

    public Destino(String destino, List<Billete> listaBilletes){
        this.destino = destino;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        return listaBilletes.stream().filter(Billete -> Billete.destino().equals(this.destino)).collect(Collectors.toList());
    }
}
