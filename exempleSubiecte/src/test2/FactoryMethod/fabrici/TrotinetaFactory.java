package test2.FactoryMethod.fabrici;

import test2.FactoryMethod.clase.Trotineta;
import test2.FactoryMethod.clase.Vehicul;

public class TrotinetaFactory implements VehiculFactory{
    @Override
    public Vehicul createVehicul(int id, String culoare) {
        return new Trotineta(id, culoare);
    }
}
