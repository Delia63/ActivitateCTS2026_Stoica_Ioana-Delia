package Spital.FactoryMethod.main;

import Spital.FactoryMethod.clase.Personal;
import Spital.FactoryMethod.fabrici.*;

public class Main {
    static void main(String[] args) {
        PersonalFactory factoryMedical = new MedicalFactory();
        PersonalFactory factoryNonMedical = new NonMedicalFactory();

        Personal brancardier = factoryMedical.getPersonal(TipMedical.Brancardier, 1, "Ion", "ZI");
        Personal secretar = factoryNonMedical.getPersonal(TipNonMedical.Secretar, 2, "Lucia");

        brancardier.descriere();
        secretar.descriere();
    }
}
