package test3.FactoryMethod.fabrici;

import test3.FactoryMethod.clase.IMeniu;
import test3.FactoryMethod.clase.MeniuVegan;

public class MeniuVeganFactory implements MeniuFactory{
    @Override
    public IMeniu createMeniu() {
        return new MeniuVegan();
    }
}
