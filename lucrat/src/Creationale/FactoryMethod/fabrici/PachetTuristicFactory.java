package Creationale.FactoryMethod.fabrici;

import Creationale.FactoryMethod.clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachet tip);
}
