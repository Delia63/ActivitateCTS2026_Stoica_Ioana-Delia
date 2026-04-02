package test10.SimpleFactory.fabrica;

import test10.SimpleFactory.clase.Cafea;
import test10.SimpleFactory.clase.Ceai;
import test10.SimpleFactory.clase.CiocolataCalda;
import test10.SimpleFactory.clase.IBautura;

public class BauturaFactory {
    public IBautura createBautura(TipBautura tipBautura, String nume, Double volum, Double pret) {
        return switch (tipBautura) {
            case Cafea -> new Cafea(nume, volum, pret);
            case Ceai -> new Ceai(nume, volum, pret);
            case CiocolataCalda -> new CiocolataCalda(nume, volum, pret);
            default -> null;
        };
    }
}
