package Creationale.SimpleFactory.ex3.factory;

import Creationale.SimpleFactory.ex3.clase.Aftermarket;
import Creationale.SimpleFactory.ex3.clase.Originala;
import Creationale.SimpleFactory.ex3.clase.Piesa;
import Creationale.SimpleFactory.ex3.clase.SH;

public class PiesaFactory {
    public Piesa getPiesa(TipOrigine tipOrigine, int id) {
        return switch (tipOrigine) {
            case TipOrigine.Originala -> new Originala(id);
            case TipOrigine.Aftermarket -> new Aftermarket(id);
            case TipOrigine.SH -> new SH(id);
            default -> null;
        };
    }
}
