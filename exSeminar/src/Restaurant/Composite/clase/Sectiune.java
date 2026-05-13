package Restaurant.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura {
    private String nume;
    private List<Structura> lista;

    public Sectiune(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura) {
        lista.add(structura);
    }

    public void stergeStructura(Structura structura) {
        lista.remove(structura);
    }

    public Structura getStructura(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere(String spatii) {
        System.out.println(spatii + "Sectiune: " + this.nume);
        spatii += " ";
        for(Structura structura : lista) {
            structura.descriere(spatii);

        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectiune{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
