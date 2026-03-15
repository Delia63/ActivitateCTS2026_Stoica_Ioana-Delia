package Spital.SimpleFactory.factory;

import Spital.SimpleFactory.clase.Asistent;
import Spital.SimpleFactory.clase.Brancardier;
import Spital.SimpleFactory.clase.Medic;
import Spital.SimpleFactory.clase.PersonalSpital;

public class FactoryPersonal {
    public PersonalSpital getPersonalSpital(TipPersonal tipPersonal, int id, String nume) {
        switch (tipPersonal) {
            case TipPersonal.BRANCARDIER: return new Brancardier(id, nume);
            case TipPersonal.ASISTENT: return new Asistent(id, nume);
            case TipPersonal.MEDIC: return new Medic(id, nume);
            default: return null;
        }
    }
}
