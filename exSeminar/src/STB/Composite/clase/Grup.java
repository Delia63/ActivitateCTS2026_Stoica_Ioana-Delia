package STB.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements Flota{
    private String numeGrup;
    private List<Flota> listaAutobuze;

    public Grup(String numeGrup) {
        this.numeGrup = numeGrup;
        this.listaAutobuze = new ArrayList<Flota>();
    }

    public void adaugaAutobuz(Flota autobuz) {
        listaAutobuze.add(autobuz);
    }

    public void stergeAutobuz(Flota autobuz) {
        listaAutobuze.remove(autobuz);
    }

    public Flota getAutobuz(int index) {
        return listaAutobuze.get(index);
    }

    @Override
    public void descriere(String spatii) {
        System.out.println("Grupa: " + this.numeGrup);
        for(Flota autobuz : listaAutobuze) {
            autobuz.descriere(spatii);
        }
    }
}
