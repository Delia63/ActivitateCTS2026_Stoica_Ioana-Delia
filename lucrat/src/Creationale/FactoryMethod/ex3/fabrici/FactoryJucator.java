package Creationale.FactoryMethod.ex3.fabrici;

import Creationale.FactoryMethod.ex3.clase.Jucator;

public interface FactoryJucator {
    public Jucator getJucator(int nrJucator, String numeJucator, int varsta);
}
