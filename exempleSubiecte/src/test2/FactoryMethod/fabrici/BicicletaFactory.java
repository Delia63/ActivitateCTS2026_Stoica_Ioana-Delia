package test2.FactoryMethod.fabrici;

import test2.FactoryMethod.clase.Bicicleta;
import test2.FactoryMethod.clase.Vehicul;

public class BicicletaFactory implements VehiculFactory{
    @Override
    public Vehicul createVehicul(int id, String culoare) {
        return new Bicicleta(id, culoare);
    }
}
