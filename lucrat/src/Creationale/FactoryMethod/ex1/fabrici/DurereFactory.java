package Creationale.FactoryMethod.ex1.fabrici;

import Creationale.FactoryMethod.ex1.clase.DurereMedicament;
import Creationale.FactoryMethod.ex1.clase.Medicament;

public class DurereFactory implements MedicamentFactory{
    @Override
    public Medicament creeazaMedicament(String nume, float pret) {
        return new DurereMedicament(nume, pret);
    }
}
