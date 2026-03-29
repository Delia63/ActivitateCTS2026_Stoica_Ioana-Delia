package test5.main;

import test5.FactoryMethod.clase.Avion;
import test5.FactoryMethod.fabrici.AvionFactory;
import test5.FactoryMethod.fabrici.CargoFactory;
import test5.SimpleFactory.clase.PersonalBord;
import test5.SimpleFactory.clase.Stewardesa;
import test5.SimpleFactory.fabrica.PersonalFactory;
import test5.SimpleFactory.fabrica.TipPersonal;

public class Main {
    static void main(String[] args) {
        AvionFactory factoryAvionCargo = new CargoFactory();
        Avion avionCargo = factoryAvionCargo.createAvion();
        avionCargo.zboara();

        PersonalFactory personalFactory = new PersonalFactory();
        PersonalBord stewardesa = personalFactory.getPersonal(TipPersonal.Stewardesa, "Maria");
        stewardesa.descriere();
    }
}
