package test6.FactoryMethod.fabrici;

import test6.FactoryMethod.clase.Laptop;
import test6.FactoryMethod.clase.Produs;

public class LaptopFactory implements ProdusFactory{
    @Override
    public Produs createProdus(String marca) {
        return new Laptop(marca);
    }
}
