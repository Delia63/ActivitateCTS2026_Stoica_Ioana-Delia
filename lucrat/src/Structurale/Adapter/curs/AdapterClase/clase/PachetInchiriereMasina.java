package Structurale.Adapter.curs.AdapterClase.clase;

import Structurale.Adapter.curs.AdapterClase.inchiriereMasini.InchiriereMasina;
import Structurale.Adapter.curs.AdapterClase.inchiriereMasini.Masina;

public class PachetInchiriereMasina extends InchiriereMasina implements PachetTuristic {

    public PachetInchiriereMasina(Masina masina) {
        super(masina);
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
