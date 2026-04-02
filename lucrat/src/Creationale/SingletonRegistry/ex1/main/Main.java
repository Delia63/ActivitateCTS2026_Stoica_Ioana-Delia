package Creationale.SingletonRegistry.ex1.main;

import Creationale.SingletonRegistry.ex1.clase.*;

public class Main {
    static void main(String[] args) {
        IEchipament boxa1 = new Boxa();
        IEchipament proiector1 = new Proiector();
        IEchipament cabluInternet1 = new CabluInternet();
        IEchipament boxa2 = new Boxa();

        try {
            RegistryEchipament.register("Boxa1", boxa1);
            IEchipament e1 = RegistryEchipament.getEchipament("Boxa1");
            e1.stareEchipament();

            RegistryEchipament.register("Boxa2", boxa2);
            IEchipament e2 = RegistryEchipament.getEchipament("Boxa2");
            e2.stareEchipament();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
