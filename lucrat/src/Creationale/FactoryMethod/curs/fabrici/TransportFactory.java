package Creationale.FactoryMethod.curs.fabrici;

import Creationale.FactoryMethod.curs.clase.PachetTuristic;
import Creationale.FactoryMethod.curs.clase.TransportAutocar;
import Creationale.FactoryMethod.curs.clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachet tip) {
        return switch (tip) {
            case TipTransport.transportAutocar -> new TransportAutocar();
            case TipTransport.transportMicrobuz -> new TransportMicrobuz();
            default -> null;
        };
    }
}
