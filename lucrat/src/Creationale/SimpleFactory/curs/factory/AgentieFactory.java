package Creationale.SimpleFactory.curs.factory;

import Creationale.SimpleFactory.curs.clase.PachetCazare;
import Creationale.SimpleFactory.curs.clase.PachetCazareTransport;
import Creationale.SimpleFactory.curs.clase.PachetTransport;
import Creationale.SimpleFactory.curs.clase.PachetTuristic;

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
