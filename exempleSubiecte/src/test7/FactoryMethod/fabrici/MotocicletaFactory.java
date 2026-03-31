package test7.FactoryMethod.fabrici;

import test7.FactoryMethod.clase.MijTransport;
import test7.FactoryMethod.clase.Motocicleta;

public class MotocicletaFactory implements MijTransportFactory{
    @Override
    public MijTransport createMijTransport(String pachet) {
        return new Motocicleta(pachet);
    }
}
