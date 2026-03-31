package test8.FactoryMethod.fabrici;

import test8.FactoryMethod.clase.Ceai;
import test8.FactoryMethod.clase.IBauturaMethod;

public class CeaiFactoryMethod implements BauturaFactoryMethod {
    @Override
    public IBauturaMethod getBautura(String nume, Double mililitri, Double pret) {
        return new Ceai(nume, mililitri, pret);
    }
}
