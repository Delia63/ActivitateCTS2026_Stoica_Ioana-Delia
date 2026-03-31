package test8.FactoryMethod.fabrici;

import test8.FactoryMethod.clase.IBauturaMethod;
import test8.FactoryMethod.clase.CiocolataCalda;

public class CiocolataCaldaFactoryMethod implements BauturaFactoryMethod {
    @Override
    public IBauturaMethod getBautura(String nume, Double mililitri, Double pret) {
        return new CiocolataCalda(nume, mililitri, pret);
    }
}
