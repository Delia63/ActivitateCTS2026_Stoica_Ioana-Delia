package Spital.FactoryMethod.fabrici;

import Spital.FactoryMethod.clase.Personal;
import Spital.FactoryMethod.clase.Registrator;
import Spital.FactoryMethod.clase.Secretar;

public class NonMedicalFactory implements PersonalFactory{
    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume) {
        return switch (tipPersonal) {
            case TipNonMedical.Registrator -> new Registrator(id, nume);
            case TipNonMedical.Secretar -> new Secretar(id, nume);
            default -> null;
        };
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume, String tura) {
        return null;
    }
}
