package test6.FactoryMethod.fabrici;

import test6.FactoryMethod.clase.Produs;
import test6.FactoryMethod.clase.Smartphone;

public class SmartphoneFactory implements ProdusFactory{
    @Override
    public Produs createProdus(String marca) {
        return new Smartphone(marca);
    }
}
