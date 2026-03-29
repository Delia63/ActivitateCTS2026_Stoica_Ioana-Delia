package test2.FactoryMethod.fabrici;

import test2.FactoryMethod.clase.Vehicul;

public interface VehiculFactory {
    public Vehicul createVehicul(int id, String culoare);
}
