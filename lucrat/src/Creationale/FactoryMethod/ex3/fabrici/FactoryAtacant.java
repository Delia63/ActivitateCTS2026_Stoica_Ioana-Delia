package Creationale.FactoryMethod.ex3.fabrici;

import Creationale.FactoryMethod.ex3.clase.Atacant;
import Creationale.FactoryMethod.ex3.clase.Jucator;

public class FactoryAtacant implements FactoryJucator{
    @Override
    public Jucator getJucator(int nrJucator, String numeJucator, int varsta) {
        return new Atacant(nrJucator, numeJucator, varsta);
    }
}
