package Structurale.Decorator.agentie.main;

import Structurale.Decorator.agentie.clase.PachetCazare;
import Structurale.Decorator.agentie.clase.PachetTuristic;
import Structurale.Decorator.agentie.decorator.OfertaPachetCazare;
import Structurale.Decorator.agentie.decorator.OfertaPachetTuristic;

public class Main {
    static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare();
        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetCazare);
        ofertaPachetTuristic.anulareRezervare();
    }
}
