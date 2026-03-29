package test3.FactoryMethod.fabrici;

import test3.FactoryMethod.clase.IMeniu;
import test3.FactoryMethod.clase.MeniuCuCarne;

public class MeniuCuCarneFactory implements MeniuFactory{
    @Override
    public IMeniu createMeniu() {
        return new MeniuCuCarne();
    }
}
