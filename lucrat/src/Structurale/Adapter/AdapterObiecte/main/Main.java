package Structurale.Adapter.AdapterObiecte.main;

import Structurale.Adapter.AdapterObiecte.clase.PachetCazare;
import Structurale.Adapter.AdapterObiecte.clase.PachetMasinaInchiriata;
import Structurale.Adapter.AdapterObiecte.clase.PachetTuristic;
import Structurale.Adapter.AdapterObiecte.inchiriereMasini.Masina;
import Structurale.Adapter.AdapterObiecte.inchiriereMasini.MasinaInchiriata;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        pachetCazare.descriere();
        pachetCazare.rezervaPachet();

        Masina masina = new Masina("Volvo", "B23PXA");
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(masina);
        masinaInchiriata.inchiriazaMasina();


//        ADAPTER
        System.out.println();
        Masina masina2 = new Masina("BMW", "B234PGS");
        MasinaInchiriata masinaInchiriata2 = new MasinaInchiriata(masina2);
        PachetTuristic pachetMasinaInchiriata = new PachetMasinaInchiriata(masinaInchiriata2);
        pachetMasinaInchiriata.rezervaPachet();
    }
}
