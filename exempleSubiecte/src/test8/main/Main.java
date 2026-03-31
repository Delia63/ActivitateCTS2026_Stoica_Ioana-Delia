package test8.main;

import test8.FactoryMethod.clase.Cafea;
import test8.FactoryMethod.clase.IBauturaMethod;
import test8.FactoryMethod.fabrici.BauturaFactoryMethod;
import test8.FactoryMethod.fabrici.CafeaFactoryMethod;
import test8.SimpleFactory.clase.IBautura;
import test8.SimpleFactory.fabrica.BauturaFactory;
import test8.SimpleFactory.fabrica.TipBautura;
import test8.Singleton.CasaMarcat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        BauturaFactory bauturaFactory = new BauturaFactory();
        IBautura cafea1 = bauturaFactory.getBautura(TipBautura.Cafea, "Capuccino", 500d, 17.5d);
        IBautura cafea2 = bauturaFactory.getBautura(TipBautura.Cafea, "Irish", 300d, 15.5d);
        IBautura ceai = bauturaFactory.getBautura(TipBautura.Ceai, "Fructe", 1000d, 5.5d);
        IBautura ciocolataCalda = bauturaFactory.getBautura(TipBautura.CiocolataCalda, "Neagra", 500d, 17.5d);

        cafea1.preparare();
        System.out.println(cafea2.getPret());
        System.out.println(ceai.getDetalii());
        ciocolataCalda.adaugaTopping();


        BauturaFactoryMethod cafeaFactory = new CafeaFactoryMethod();
        IBauturaMethod cafea = cafeaFactory.getBautura("Capuccinom", 500d, 10.5d);
        cafea.preparare();
        System.out.println(cafea.getDetalii());
        System.out.println(cafea.getPret());
        System.out.println(cafea.adaugaTopping());


        List<IBautura> listaComenzi = new ArrayList<>();
        listaComenzi.add(cafea1);
        listaComenzi.add(cafea2);

        CasaMarcat casaMarcat = CasaMarcat.getInstanta(listaComenzi);
        System.out.println(casaMarcat.getPretTotal());
        System.out.println(casaMarcat);

    }
}
