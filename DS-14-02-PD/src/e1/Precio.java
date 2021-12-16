package e1;

import java.util.ArrayList;
import java.util.List;

public class Precio implements Componente{
    private final float precio;
    private final List<Billete> listaBilletes;

    public Precio(float precio, List<Billete> listaBilletes){
        this.precio = precio;
        this.listaBilletes = listaBilletes;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        for(Billete billete : listaBilletes)
            if(billete.precio() <= precio)
                comparados.add(billete);
        return comparados;
    }
}
