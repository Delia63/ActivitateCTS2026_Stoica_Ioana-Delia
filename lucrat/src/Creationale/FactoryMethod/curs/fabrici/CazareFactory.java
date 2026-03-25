package Creationale.FactoryMethod.curs.fabrici;

import Creationale.FactoryMethod.curs.clase.CazareCabana;
import Creationale.FactoryMethod.curs.clase.CazareHotel;
import Creationale.FactoryMethod.curs.clase.PachetTuristic;

public class CazareFactory implements PachetTuristicFactory{
    @Override
    public PachetTuristic crearePachet(TipPachet tip) {
        return switch (tip) {
            case TipCazare.CazareCabana -> new CazareCabana();
            case TipCazare.CazareHotel -> new CazareHotel();
            default -> null;
        };
    }
}
