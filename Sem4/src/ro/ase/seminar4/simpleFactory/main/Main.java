package ro.ase.seminar4.simpleFactory.main;

import ro.ase.seminar4.simpleFactory.clase.MijlocTransport;
import ro.ase.seminar4.simpleFactory.clase.factory.FactoryTransport;
import ro.ase.seminar4.simpleFactory.clase.factory.TipTransport;
import ro.ase.seminar4.simpleFactory.clase.famClase.Autobuz;

public class Main {
    public void main(String[] args) {
        FactoryTransport fabricaTransport = new FactoryTransport();

        MijlocTransport autobuz = fabricaTransport.getMijlocTransport(TipTransport.AUTOBUZ, 44, "MAN");
        MijlocTransport tramvai = fabricaTransport.getMijlocTransport(TipTransport.TRAMVAI, 102, "MAN");
        MijlocTransport troleibuz = fabricaTransport.getMijlocTransport(TipTransport.TROLEIBUZ, 202, "MAN");

        autobuz.afiseazaTipTransport();
        tramvai.afiseazaTipTransport();
        troleibuz.afiseazaTipTransport();
    }
}
