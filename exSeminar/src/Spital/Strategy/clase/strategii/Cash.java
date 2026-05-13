package Spital.Strategy.clase.strategii;

import Spital.Strategy.clase.Pacient;

public class Cash implements ModPlata {
    @Override
    public void platesteInternare(Pacient pacient, double sumaPlata) {
        System.out.println("Pacientul " + pacient.getNume()
                + " a platit suma " + sumaPlata + " de lei cash.");
    }
}
