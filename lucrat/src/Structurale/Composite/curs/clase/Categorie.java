package Structurale.Composite.curs.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune{
    private List<Optiune> categorii;
    private String nume;

    public Categorie(String nume) {
        this.categorii = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void stergeNod(Optiune optiune) {
        categorii.remove(optiune);
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        categorii.add(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return categorii.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+this.nume);
        for(Optiune optiune : categorii) {
            optiune.descriere();
        }
    }
}
