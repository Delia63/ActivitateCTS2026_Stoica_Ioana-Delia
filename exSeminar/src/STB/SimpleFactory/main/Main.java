package STB.SimpleFactory.main;

import STB.SimpleFactory.clase.MijlocTransport;
import STB.SimpleFactory.clase.factory.FactoryTransport;
import STB.SimpleFactory.clase.factory.TipTransport;

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