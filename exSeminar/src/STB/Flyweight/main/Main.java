package STB.Flyweight.main;

import STB.Flyweight.clase.Autobuz;
import STB.Flyweight.clase.FabricaDeLinii;
import STB.Flyweight.clase.ILinie;
import STB.Flyweight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        ILinie linie = new Linie(102, "Malu Rosu", "Gara Vest");
        Autobuz autobuz = new Autobuz("MAN", "2019", 30);
//        linie.descriereLinie(autobuz);

        FabricaDeLinii fabricaDeLinii = new FabricaDeLinii();
        fabricaDeLinii.getLinie(101, "Spitalul Judetean", "Gara Sud").descriereLinie(autobuz);

    }
}
