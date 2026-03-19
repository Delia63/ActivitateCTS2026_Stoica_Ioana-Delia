package Creationale.SimpleFactory.factory;

import Creationale.SimpleFactory.clase.PachetCazare;
import Creationale.SimpleFactory.clase.PachetCazareTransport;
import Creationale.SimpleFactory.clase.PachetTransport;
import Creationale.SimpleFactory.clase.PachetTuristic;

public class AgentieFactory {
    public PachetTuristic createPachet(TipPachet tipPachet) throws Exception {
        switch (tipPachet) {
            case pachetCazare:
                return new PachetCazare();
            case pachetTransport:
                return new PachetTransport();
            case pachetCazareTransport:
                return new PachetCazareTransport();
            default:
                throw new Exception("Tipul primit nu este corect.");
        }
    }
}
