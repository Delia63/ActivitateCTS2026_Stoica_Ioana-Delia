package test11.SimpleFactory.fabrica;

import test11.SimpleFactory.clase.AMasina;
import test11.SimpleFactory.clase.SUV;
import test11.SimpleFactory.clase.VAN;

public class MasinaFabrica {
    public AMasina getMasina(TipMasina tipMasina, String nrInmatriculare, String model) {
        return switch (tipMasina) {
            case SUV -> new SUV(nrInmatriculare, model);
            case VAN -> new VAN(nrInmatriculare, model);
            default -> null;
        };
    }
}
