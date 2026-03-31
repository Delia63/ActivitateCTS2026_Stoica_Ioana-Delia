package test8.FactoryMethod.fabrici;

import test8.FactoryMethod.clase.IBauturaMethod;

public interface BauturaFactoryMethod {
    public IBauturaMethod getBautura(String nume, Double mililitri, Double pret);
}
