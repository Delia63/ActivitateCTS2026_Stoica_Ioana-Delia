package Creationale.SimpleFactory.ex5.fabrica;

import Creationale.SimpleFactory.ex5.clase.Atacant;
import Creationale.SimpleFactory.ex5.clase.Fundas;
import Creationale.SimpleFactory.ex5.clase.Jucator;
import Creationale.SimpleFactory.ex5.clase.Portar;

public class FactoryJucator {
    public Jucator getJucator(TipJucator tipJucator, int nrJucator, String numeJucator, int varsta) {
        return switch (tipJucator) {
            case TipJucator.Portar -> new Portar(nrJucator, numeJucator, varsta);
            case TipJucator.Atacant -> new Atacant(nrJucator, numeJucator, varsta);
            case TipJucator.Fundas -> new Fundas(nrJucator, numeJucator, varsta);
            default -> null;
        };
    }
}
