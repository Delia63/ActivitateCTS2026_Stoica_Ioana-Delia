package STB.AdapterClase.main;

import STB.AdapterClase.clase.AdapterBiletMetrou;
import STB.AdapterClase.clase.BiletSTB;
import STB.AdapterClase.clase.IMetrou;
import STB.AdapterClase.clase.Metrou;

public class Main {
    public static void main(String[] args) {
        BiletSTB biletSTB = new BiletSTB("12.05.2026");
        biletSTB.folosesteBilet();

        IMetrou metrou = new Metrou("Crangasi");
        metrou.intraInMetrou();

        AdapterBiletMetrou adapterBiletMetrou = new AdapterBiletMetrou(biletSTB);
        adapterBiletMetrou.intraInMetrou();
    }
}
