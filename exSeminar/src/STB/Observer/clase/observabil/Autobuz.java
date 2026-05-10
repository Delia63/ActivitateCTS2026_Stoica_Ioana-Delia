package STB.Observer.clase.observabil;

import STB.Observer.clase.observer.ICalator;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements IAutobuz{
    private String nrLinie;
    private List<ICalator> listaCalatori;

    public Autobuz(String nrLinie) {
        this.nrLinie = nrLinie;
        this.listaCalatori = new ArrayList<>();
    }

    @Override
    public void abonareCalator(ICalator calator) {
        listaCalatori.add(calator);
    }

    @Override
    public void dezabonareCalator(ICalator calator) {
        listaCalatori.remove(calator);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(ICalator calator : listaCalatori) {
            calator.primesteNotificare("Autobuz linia "+this.nrLinie+": "+mesaj);
        }
    }

    public void trimiteNotificarePlecare() {
        trimiteNotificare("Am plecat din capat de linie!");
    }
}
