package Structurale.Composite.ex1.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Structura{
    private String numeSectiune;
    private List<Structura> listaStructuri;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.listaStructuri = new ArrayList<Structura>();
    }

    public void adaugaStructura(Structura structura) {
        listaStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) throws Exception {
        if(listaStructuri.size() > 0) {
            listaStructuri.remove(structura);
        }
        else {
            throw new Exception();
        }
    }

    @Override
    public void descriereSectiune(String spatii) {
        System.out.println(spatii + "Sectiune: " + this.numeSectiune);
        spatii += "  ";
        for(Structura structura : listaStructuri) {
            structura.descriereSectiune(spatii);
        }
    }
}
