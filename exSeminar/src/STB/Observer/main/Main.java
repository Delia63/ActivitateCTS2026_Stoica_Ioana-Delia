package STB.Observer.main;

import STB.Observer.clase.observabil.Autobuz;
import STB.Observer.clase.observabil.IAutobuz;
import STB.Observer.clase.observer.Calator;
import STB.Observer.clase.observer.ICalator;

public class Main {
    static void main(String[] args) {
        IAutobuz autobuz = new Autobuz("102");

        ICalator calator1 = new Calator("Popescu");
        ICalator calator2 = new Calator("Maria");
        ICalator calator3 = new Calator("Lucia");

        autobuz.abonareCalator(calator1);
        autobuz.abonareCalator(calator2);
        ((Autobuz) autobuz).trimiteNotificarePlecare();
    }
}
