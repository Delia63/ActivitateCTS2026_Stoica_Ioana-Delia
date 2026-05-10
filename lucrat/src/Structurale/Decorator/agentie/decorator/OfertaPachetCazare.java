package Structurale.Decorator.agentie.decorator;

import Structurale.Decorator.agentie.clase.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic{
    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Pachetul de cazare a fost anulat.");
    }
}
