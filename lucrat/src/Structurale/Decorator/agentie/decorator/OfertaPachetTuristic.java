package Structurale.Decorator.agentie.decorator;

import Structurale.Decorator.agentie.clase.PachetTuristic;

public abstract class OfertaPachetTuristic implements PachetTuristic {
    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        this.pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();
}
