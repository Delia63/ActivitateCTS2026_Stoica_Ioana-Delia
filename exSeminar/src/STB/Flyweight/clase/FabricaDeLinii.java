package STB.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeLinii {
    private Map<Integer, ILinie> listaLinii;

    public FabricaDeLinii() {
        this.listaLinii = new HashMap<>();
    }

    public ILinie getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if(listaLinii.containsKey(nrLinie)) {
            return listaLinii.get(nrLinie);
        }
        else {
            ILinie linie = new Linie(nrLinie, primaStatie, ultimaStatie);
            listaLinii.put(nrLinie, linie);
            return linie;
        }
    }
}
