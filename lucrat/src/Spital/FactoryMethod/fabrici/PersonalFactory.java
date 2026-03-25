package Spital.FactoryMethod.fabrici;

import Spital.FactoryMethod.clase.Personal;

public interface PersonalFactory {
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume);
    public Personal getPersonal(TipPersonal tipPersonal, int id, String nume, String tura);
}
