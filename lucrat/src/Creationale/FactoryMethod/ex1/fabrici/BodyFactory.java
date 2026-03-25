package Creationale.FactoryMethod.ex1.fabrici;

import Creationale.FactoryMethod.ex1.clase.BodyMedicament;
import Creationale.FactoryMethod.ex1.clase.Medicament;

public class BodyFactory implements MedicamentFactory{
    @Override
    public Medicament creeazaMedicament(String nume, float pret) {
        return new BodyMedicament(nume, pret);
    }
}
