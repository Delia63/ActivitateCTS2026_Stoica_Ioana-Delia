package STB.Prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String model;
    private List<String> listaSetari;

    public Autobuz(String model, List<String> listaSetari) {
        this.model = model;
        this.listaSetari = listaSetari;
    }

    private Autobuz() {

    }

    @Override
    public IAutobuz copiaza() {
        Autobuz autobuz = new Autobuz();
        autobuz.model = this.model;
        autobuz.listaSetari = new ArrayList<String>(this.listaSetari);
        return autobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", listaSetari=").append(listaSetari);
        sb.append('}');
        return sb.toString();
    }

    public List<String> getListaSetari() {
        return listaSetari;
    }
}
