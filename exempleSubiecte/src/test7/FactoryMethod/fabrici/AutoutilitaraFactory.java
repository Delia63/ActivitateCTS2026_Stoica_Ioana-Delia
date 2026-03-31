package test7.FactoryMethod.fabrici;

import test7.FactoryMethod.clase.Autoutilitara;
import test7.FactoryMethod.clase.MijTransport;

public class AutoutilitaraFactory implements MijTransportFactory{
    @Override
    public MijTransport createMijTransport(String pachet) {
        return new Autoutilitara(pachet);
    }
}
