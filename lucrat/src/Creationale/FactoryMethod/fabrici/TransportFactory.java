package Creationale.FactoryMethod.fabrici;

import Creationale.FactoryMethod.clase.PachetTuristic;
import Creationale.FactoryMethod.clase.TransportAutocar;
import Creationale.FactoryMethod.clase.TransportMicrobuz;

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
