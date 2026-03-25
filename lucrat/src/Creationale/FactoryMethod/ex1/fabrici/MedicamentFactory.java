package Creationale.FactoryMethod.ex1.fabrici;

import Creationale.FactoryMethod.ex1.clase.Medicament;

public interface MedicamentFactory {
    public Medicament creeazaMedicament(String nume, float pret);
}
