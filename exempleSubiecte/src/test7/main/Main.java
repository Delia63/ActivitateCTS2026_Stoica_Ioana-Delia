package test7.main;

import test7.FactoryMethod.clase.Camion;
import test7.FactoryMethod.clase.MijTransport;
import test7.FactoryMethod.fabrici.CamionFactory;
import test7.FactoryMethod.fabrici.MijTransportFactory;
import test7.Singleton.clase.RegistruCentral;

public class Main {
    static void main(String[] args) {
        RegistruCentral registruCentral1 = RegistruCentral.getInstanta("Maria");
        System.out.println(registruCentral1);
        RegistruCentral registruCentral2 = RegistruCentral.getInstanta("Marius");
        System.out.println(registruCentral2);

        MijTransportFactory mijTransportFactory = new CamionFactory();
        MijTransport camion = mijTransportFactory.createMijTransport("carti");
        camion.livreazaPachet();
    }
}
