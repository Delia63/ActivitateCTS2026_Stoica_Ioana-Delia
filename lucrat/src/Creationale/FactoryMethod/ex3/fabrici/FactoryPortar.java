package Creationale.FactoryMethod.ex3.fabrici;

import Creationale.FactoryMethod.ex3.clase.Jucator;
import Creationale.FactoryMethod.ex3.clase.Portar;

public class FactoryPortar implements FactoryJucator {

    @Override
    public Jucator getJucator(int nrJucator, String numeJucator, int varsta) {
        return new Portar(nrJucator, numeJucator, varsta);
    }
}
