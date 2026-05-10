package Structurale.Adapter.AdapterClase.clase;

import Structurale.Adapter.AdapterClase.inchiriereMasini.InchiriereMasina;
import Structurale.Adapter.AdapterClase.inchiriereMasini.Masina;

public class PachetInchiriereMasina extends InchiriereMasina implements PachetTuristic {

    public PachetInchiriereMasina(Masina masina) {
        super(masina);
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
