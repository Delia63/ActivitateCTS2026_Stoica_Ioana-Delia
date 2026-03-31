package test6.FactoryMethod.fabrici;

import test6.FactoryMethod.clase.Produs;
import test6.FactoryMethod.clase.Tableta;

public class TabletaFactory implements ProdusFactory{
    @Override
    public Produs createProdus(String marca) {
        return new Tableta(marca);
    }
}
