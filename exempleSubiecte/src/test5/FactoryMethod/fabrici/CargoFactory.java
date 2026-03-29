package test5.FactoryMethod.fabrici;

import test5.FactoryMethod.clase.Avion;
import test5.FactoryMethod.clase.AvionCargo;

public class CargoFactory implements AvionFactory{

    @Override
    public Avion createAvion() {
        return new AvionCargo();
    }
}
