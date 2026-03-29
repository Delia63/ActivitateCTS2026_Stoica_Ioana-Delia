package Restaurant.FactoryMethod.main;

import Restaurant.FactoryMethod.clase.FelMancare;
import Restaurant.FactoryMethod.clase.Supa;
import Restaurant.FactoryMethod.clase.SupaCrema;
import Restaurant.FactoryMethod.fabrici.*;

public class Main {
    static void main(String[] args) {
        FelMancareFactory fabricaSupa = new SupaFactory();
        FelMancare supaCrema = fabricaSupa.getFelMancare(TipSupa.SUPA_CREMA, 150, 15.5f);
        FelMancare ciorba = fabricaSupa.getFelMancare(TipSupa.CIORBA, 200, 20.5f);

        FelMancareFactory fabricaDesert = new DesertFactory();
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 500, 25.5f, 1500);
        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 500, 27.5f, 1600);

        supaCrema.afiseaza();
        ciorba.afiseaza();
        papanasi.afiseaza();
        clatite.afiseaza();

    }
}
