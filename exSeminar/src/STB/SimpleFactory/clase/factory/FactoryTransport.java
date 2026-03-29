package STB.SimpleFactory.clase.factory;

import STB.SimpleFactory.clase.MijlocTransport;
import STB.SimpleFactory.clase.famClase.Autobuz;
import STB.SimpleFactory.clase.famClase.Tramvai;
import STB.SimpleFactory.clase.famClase.Troleibuz;

public class FactoryTransport {
    public MijlocTransport getMijlocTransport(TipTransport tipTransport, int nrLinie, String marca) {
        switch (tipTransport) {
            case TipTransport.AUTOBUZ: return new Autobuz(nrLinie, marca);
            case TipTransport.TRAMVAI: return new Tramvai(nrLinie, marca);
            case TipTransport.TROLEIBUZ: return new Troleibuz(nrLinie, marca);
            default: return null;
        }
    }
}
