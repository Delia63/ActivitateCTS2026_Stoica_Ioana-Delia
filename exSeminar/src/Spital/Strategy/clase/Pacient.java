package Spital.Strategy.clase;

import Spital.Strategy.clase.strategii.Card;
import Spital.Strategy.clase.strategii.ModPlata;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
        this.modPlata = new Card();
    }

    public String getNume() {
        return nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteInternare(double sumaPlata) {
        modPlata.platesteInternare(this, sumaPlata);
    }


}
