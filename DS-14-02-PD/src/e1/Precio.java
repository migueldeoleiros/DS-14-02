package e1;

import java.util.List;
import java.util.stream.Collectors;

public class Precio implements Componente{
    private final float precio;
    private final List<Billete> listaBilletes;

    public Precio(float precio, List<Billete> listaBilletes){
        this.precio = precio;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        return listaBilletes.stream().filter(Billete -> Billete.precio()<=(this.precio)).collect(Collectors.toList());
    }
}
