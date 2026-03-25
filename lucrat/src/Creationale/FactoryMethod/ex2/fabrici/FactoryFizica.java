package Creationale.FactoryMethod.ex2.fabrici;

import Creationale.FactoryMethod.ex2.clase.Client;
import Creationale.FactoryMethod.ex2.clase.PersoanaFizica;

public class FactoryFizica implements FactoryClient{
    @Override
    public Client creareClient(String nume) {
        return new PersoanaFizica(nume);
    }
}
