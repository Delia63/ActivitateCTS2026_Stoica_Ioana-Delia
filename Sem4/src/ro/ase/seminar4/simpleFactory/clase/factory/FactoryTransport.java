package ro.ase.seminar4.simpleFactory.clase.factory;

import ro.ase.seminar4.simpleFactory.clase.MijlocTransport;
import ro.ase.seminar4.simpleFactory.clase.famClase.Autobuz;
import ro.ase.seminar4.simpleFactory.clase.famClase.Tramvai;
import ro.ase.seminar4.simpleFactory.clase.famClase.Troleibuz;

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
