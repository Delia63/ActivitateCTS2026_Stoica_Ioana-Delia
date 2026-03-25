package Spital.FactoryMethod.fabrici;

import Spital.FactoryMethod.clase.Asistent;
import Spital.FactoryMethod.clase.Brancardier;
import Spital.FactoryMethod.clase.Medic;
import Spital.FactoryMethod.clase.Personal;

public class MedicalFactory implements PersonalFactory{
    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume) {
        return null;
    }

    @Override
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume, String tura) {
        return switch (tipPersonal) {
            case TipMedical.Medic -> new Medic(id, nume, tura);
            case TipMedical.Asistent -> new Asistent(id, nume, tura);
            case TipMedical.Brancardier -> new Brancardier(id, nume, tura);
            default -> null;
        };
    }
}
