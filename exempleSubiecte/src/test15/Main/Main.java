package test15.Main;

import test15.FactoryMethod.clase.ITransport;
import test15.FactoryMethod.fabrici.AvionFactory;
import test15.FactoryMethod.fabrici.CamionFactory;
import test15.FactoryMethod.fabrici.ITransportFactory;
import test15.FactoryMethod.fabrici.NavaFactory;

public class Main {
    public static void main(String[] args) {
        ITransportFactory camionFactory = new CamionFactory();
        ITransport camion = camionFactory.getTransport();
        camion.descriere();

        ITransportFactory navaFactory = new NavaFactory();
        ITransport nava = navaFactory.getTransport();
        nava.descriere();

        ITransportFactory  avionFactory= new AvionFactory();
        ITransport avion = avionFactory.getTransport();
        avion.descriere();
    }
}
