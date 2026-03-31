package test8.SimpleFactory.fabrica;

import test8.SimpleFactory.clase.Cafea;
import test8.SimpleFactory.clase.Ceai;
import test8.SimpleFactory.clase.CiocolataCalda;
import test8.SimpleFactory.clase.IBautura;

public class BauturaFactory {
    public IBautura getBautura(TipBautura tipBautura, String nume, Double mililitri, Double pret) {
        return switch (tipBautura) {
            case TipBautura.Cafea -> new Cafea(nume, mililitri, pret);
            case TipBautura.Ceai -> new Ceai(nume, mililitri, pret);
            case TipBautura.CiocolataCalda -> new CiocolataCalda(nume, mililitri, pret);
            default -> null;
        };
    }
}
