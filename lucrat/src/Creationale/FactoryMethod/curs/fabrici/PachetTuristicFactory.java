package Creationale.FactoryMethod.curs.fabrici;

import Creationale.FactoryMethod.curs.clase.PachetTuristic;

public interface PachetTuristicFactory {
    PachetTuristic crearePachet(TipPachet tip);
}
