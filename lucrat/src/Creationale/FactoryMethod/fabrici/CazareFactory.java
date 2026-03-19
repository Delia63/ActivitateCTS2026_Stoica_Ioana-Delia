package Creationale.FactoryMethod.fabrici;

import Creationale.FactoryMethod.clase.CazareCabana;
import Creationale.FactoryMethod.clase.CazareHotel;
import Creationale.FactoryMethod.clase.PachetTuristic;

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
