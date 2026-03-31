package test7.FactoryMethod.fabrici;

import test7.FactoryMethod.clase.Camion;
import test7.FactoryMethod.clase.MijTransport;

public class CamionFactory implements MijTransportFactory{
    @Override
    public MijTransport createMijTransport(String pachet) {
        return new Camion(pachet);
    }
}
