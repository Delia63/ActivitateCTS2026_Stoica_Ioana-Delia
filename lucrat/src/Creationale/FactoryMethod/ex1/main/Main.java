package Creationale.FactoryMethod.ex1.main;

import Creationale.FactoryMethod.ex1.clase.Medicament;
import Creationale.FactoryMethod.ex1.fabrici.DurereFactory;
import Creationale.FactoryMethod.ex1.fabrici.MedicamentFactory;
import Creationale.FactoryMethod.ex1.fabrici.RacealaFactory;

public class Main {
    static void main(String[] args) {
        MedicamentFactory factoryDurere = new DurereFactory();
        Medicament m1 = factoryDurere.creeazaMedicament("Nurofen", 30.5f);
        m1.descriere();

        MedicamentFactory factoryRaceala = new RacealaFactory();
        Medicament m2 = factoryRaceala.creeazaMedicament("Prospan", 14);
        m2.descriere();

    }
}
