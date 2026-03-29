package test5.SimpleFactory.fabrica;

import test5.SimpleFactory.clase.Copilot;
import test5.SimpleFactory.clase.PersonalBord;
import test5.SimpleFactory.clase.Pilot;
import test5.SimpleFactory.clase.Stewardesa;

public class PersonalFactory {
    public PersonalBord getPersonal(TipPersonal tipPersonal, String nume) {
        return switch (tipPersonal) {
            case TipPersonal.Pilot -> new Pilot(nume);
            case TipPersonal.Copilot -> new Copilot(nume);
            case TipPersonal.Stewardesa -> new Stewardesa(nume);
            default -> null;
        };
    }
}
