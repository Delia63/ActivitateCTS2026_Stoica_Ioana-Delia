package Spital.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> subStructuri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.subStructuri = new ArrayList<Structura>();
    }

    public void adaugaStructura(Structura structura) {
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        subStructuri.remove(structura);
    }

    public void getStructura(int index) {
        subStructuri.get(index);
    }


    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume departament - " + this.numeDepartament);
        System.out.println(spatii+"Lista structuri: \n");
        for(Structura s : subStructuri) {
            s.afiseazaDetaliiStructura(spatii+"  ");
        }
    }
}
