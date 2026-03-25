package Creationale.FactoryMethod.ex2.fabrici;

import Creationale.FactoryMethod.ex2.clase.Client;
import Creationale.FactoryMethod.ex2.clase.PersoanaFizica;
import Creationale.FactoryMethod.ex2.clase.PersoanaJuridica;

public class FactoryJuridica implements FactoryClient{
    @Override
    public Client creareClient(String nume) {
        return new PersoanaJuridica(nume);
    }
}
