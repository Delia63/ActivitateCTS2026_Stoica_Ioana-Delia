package test5.FactoryMethod.fabrici;

import test5.FactoryMethod.clase.Avion;
import test5.FactoryMethod.clase.AvionPasageri;

public class PasageriFactory implements AvionFactory{
    @Override
    public Avion createAvion() {
        return new AvionPasageri();
    }
}
