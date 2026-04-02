package test15.FactoryMethod.fabrici;

import test15.FactoryMethod.clase.Camion;
import test15.FactoryMethod.clase.ITransport;
import test15.FactoryMethod.clase.Nava;

public class NavaFactory implements ITransportFactory{
    @Override
    public ITransport getTransport() {
        return new Nava();
    }
}
