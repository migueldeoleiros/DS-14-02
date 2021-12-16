package e1;

import java.util.ArrayList;
import java.util.List;

public class AND implements Componente{
    private final Componente a;
    private final Componente b;

    public AND(Componente a, Componente b){
        this.a = a;
        this.b = b;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        for(Billete billeteA : a.find())
            for(Billete billeteB : b.find())
                if(billeteA == billeteB)
                    comparados.add(billeteA);
        return comparados;
    }
}
