package test5.FactoryMethod.fabrici;

import test5.FactoryMethod.clase.Avion;
import test5.FactoryMethod.clase.AvionPrivat;

public class PrivatFactory implements AvionFactory{
    @Override
    public Avion createAvion() {
        return new AvionPrivat();
    }
}
