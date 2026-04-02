package test15.FactoryMethod.fabrici;

import test15.FactoryMethod.clase.Avion;
import test15.FactoryMethod.clase.Camion;
import test15.FactoryMethod.clase.ITransport;

public class AvionFactory implements ITransportFactory{
    @Override
    public ITransport getTransport() {
        return new Avion();
    }
}
