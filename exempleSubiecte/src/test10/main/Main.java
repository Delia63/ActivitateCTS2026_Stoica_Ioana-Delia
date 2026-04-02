package test10.main;

import test10.Prototype.BauturaPresetata;
import test10.Prototype.IBauturaPresetata;
import test10.SimpleFactory.clase.IBautura;
import test10.SimpleFactory.fabrica.BauturaFactory;
import test10.SimpleFactory.fabrica.TipBautura;

public class Main {
    static void main(String[] args) {
        BauturaFactory bauturaFactory = new BauturaFactory();
        IBautura latteFavorit = bauturaFactory.createBautura(TipBautura.Cafea, "Latte", 200d,20.5);
        IBautura ceai1 = bauturaFactory.createBautura(TipBautura.Ceai, "Ghimbir", 200d,14.0);
        IBautura ciocolataCalda1 = bauturaFactory.createBautura(TipBautura.CiocolataCalda, "Ciocolata alba", 200d,21.5);
        IBautura cafea2 = bauturaFactory.createBautura(TipBautura.Cafea, "Frappe", 500.0,24.0);

        latteFavorit.modPreparare();
        cafea2.modPreparare();
        ciocolataCalda1.modPreparare();
        ceai1.modPreparare();

        IBauturaPresetata sablonLatte = new BauturaPresetata(latteFavorit);
        IBauturaPresetata comanda1 = sablonLatte.copiaza();
        System.out.println(comanda1);

        IBauturaPresetata sablonCeai = new BauturaPresetata(ceai1);
        IBauturaPresetata comanda2 = sablonCeai.copiaza();
        System.out.println(comanda2);





    }
}
