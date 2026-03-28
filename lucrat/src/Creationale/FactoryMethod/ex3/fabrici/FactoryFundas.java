package Creationale.FactoryMethod.ex3.fabrici;

import Creationale.FactoryMethod.ex3.clase.Fundas;
import Creationale.FactoryMethod.ex3.clase.Jucator;

public class FactoryFundas implements FactoryJucator{
    @Override
    public Jucator getJucator(int nrJucator, String numeJucator, int varsta) {
        return new Fundas(nrJucator, numeJucator, varsta);
    }
}
