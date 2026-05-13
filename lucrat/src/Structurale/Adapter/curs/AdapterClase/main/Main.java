package Structurale.Adapter.curs.AdapterClase.main;

import Structurale.Adapter.curs.AdapterClase.clase.PachetCazare;
import Structurale.Adapter.curs.AdapterClase.clase.PachetInchiriereMasina;
import Structurale.Adapter.curs.AdapterClase.clase.PachetTuristic;
import Structurale.Adapter.curs.AdapterClase.inchiriereMasini.InchiriereMasina;
import Structurale.Adapter.curs.AdapterClase.inchiriereMasini.Masina;

public class Main {
    public static void main(String[] args) {
//        FARA ADAPTER
        PachetTuristic pachetCazare1 = new PachetCazare();
        pachetCazare1.rezervaPachet();

        Masina masina1 = new Masina("Peugeot", "gri");
        InchiriereMasina masinaInchiriata = new InchiriereMasina(masina1);
        masinaInchiriata.inchiriazaMasina();


//        CU ADAPTER
        System.out.println("\n");
        PachetTuristic pachetCazare2 = new PachetCazare();
        pachetCazare2.rezervaPachet();

        Masina masina2 = new Masina("Reunault","alb");
        InchiriereMasina masinaInchiriata2 = new InchiriereMasina(masina2);
        PachetTuristic pachetInchiriereMasina = new PachetInchiriereMasina(masina2);
        pachetInchiriereMasina.rezervaPachet();

    }
}
