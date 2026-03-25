package Creationale.FactoryMethod.ex1.fabrici;

import Creationale.FactoryMethod.ex1.clase.Medicament;
import Creationale.FactoryMethod.ex1.clase.RacealaMedicament;

public class RacealaFactory implements MedicamentFactory{
    @Override
    public Medicament creeazaMedicament(String nume, float pret) {
        return new RacealaMedicament(nume, pret);
    }
}
