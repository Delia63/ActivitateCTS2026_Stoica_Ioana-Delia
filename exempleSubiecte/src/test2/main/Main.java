package test2.main;

import test2.Builder.clase.IRezervareBuilder;
import test2.Builder.clase.Rezervare;
import test2.Builder.clase.RezervareBuiler;
import test2.FactoryMethod.clase.Vehicul;
import test2.FactoryMethod.fabrici.BicicletaFactory;
import test2.FactoryMethod.fabrici.TrotinetaFactory;
import test2.FactoryMethod.fabrici.VehiculFactory;

public class Main {
    public static void main(String[] args) {
        VehiculFactory factoryBicicleta = new BicicletaFactory();
        Vehicul bicicleta = factoryBicicleta.createVehicul(1, "Rosu");

        VehiculFactory factoryTrotineta = new TrotinetaFactory();
        Vehicul trotineta = factoryTrotineta.createVehicul(2, "Verde");

        bicicleta.descriere();
        trotineta.descriere();

        RezervareBuiler builder = new RezervareBuiler();
        Rezervare rezervare1 = builder.setCascaProtectie(true).build("Lucia");
        Rezervare rezervare2 = builder.setCascaProtectie(true).setAsigurareAccidente(true).setCosCumparaturi(true).setNrKm(50).build("Maria");
        System.out.println(rezervare1);
        System.out.println(rezervare2);


    }
}
