package test1.SimpleFactory.factory;

import test1.SimpleFactory.clase.AMasina;
import test1.SimpleFactory.clase.SUV;
import test1.SimpleFactory.clase.Sedan;
import test1.SimpleFactory.clase.VAN;

public class FactoryMasina {
    public AMasina getMasina(TipMasina tipMasina, String nrInmatriculare, String modelMasina) {
        return switch (tipMasina) {
            case TipMasina.SUV -> new SUV(nrInmatriculare, modelMasina);
            case TipMasina.VAN -> new VAN(nrInmatriculare, modelMasina);
            case TipMasina.SEDAN -> new Sedan(nrInmatriculare, modelMasina);
            default -> null;
        };
    }
}
