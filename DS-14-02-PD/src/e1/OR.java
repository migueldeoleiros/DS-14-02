package e1;

import java.util.ArrayList;
import java.util.List;

public final class OR implements Componente{
    private final Componente a;
    private final Componente b;

    public OR(Componente a, Componente b){
        this.a = a;
        this.b = b;
    }
    @Override
    public List<Billete> find() {
        List<Billete> comparados = new ArrayList<>();
        comparados.addAll(a.find());
        comparados.addAll(b.find());
        return comparados;
    }
}
