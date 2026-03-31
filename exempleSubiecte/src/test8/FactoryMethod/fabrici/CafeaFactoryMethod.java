package test8.FactoryMethod.fabrici;

import test8.FactoryMethod.clase.IBauturaMethod;
import test8.FactoryMethod.clase.Cafea;

public class CafeaFactoryMethod implements BauturaFactoryMethod {
    @Override
    public IBauturaMethod getBautura(String nume, Double mililitri, Double pret) {
        return new Cafea(nume, mililitri, pret);
    }
}
