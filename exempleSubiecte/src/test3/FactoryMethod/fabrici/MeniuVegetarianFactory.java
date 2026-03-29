package test3.FactoryMethod.fabrici;

import test3.FactoryMethod.clase.IMeniu;
import test3.FactoryMethod.clase.MeniuVegetarian;

public class MeniuVegetarianFactory implements MeniuFactory{
    @Override
    public IMeniu createMeniu() {
        return new MeniuVegetarian();

    }
}
