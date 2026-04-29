package Spital.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectia implements Structura{
    private String numeSectie;
    private int nrAngajati;

    public Sectia(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii+"Nume sectie - "+this.numeSectie+" Nr angajati - "+this.nrAngajati);
    }
}
