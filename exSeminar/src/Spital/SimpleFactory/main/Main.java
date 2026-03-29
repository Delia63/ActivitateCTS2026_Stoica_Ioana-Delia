package Spital.SimpleFactory.main;

import Spital.SimpleFactory.clase.PersonalSpital;
import Spital.SimpleFactory.factory.FactoryPersonal;
import Spital.SimpleFactory.factory.TipPersonal;

public class Main {
    public void main(String[] args) {
        FactoryPersonal fabricaPersonal = new FactoryPersonal();

        PersonalSpital medic = fabricaPersonal.getPersonalSpital(TipPersonal.MEDIC, 1, "Luca");
        PersonalSpital asistent = fabricaPersonal.getPersonalSpital(TipPersonal.ASISTENT, 2, "Maria");
        PersonalSpital brancardier = fabricaPersonal.getPersonalSpital(TipPersonal.BRANCARDIER, 3, "Mario");

        medic.afisarePersonal();
        asistent.afisarePersonal();
        brancardier.afisarePersonal();
    }
}
