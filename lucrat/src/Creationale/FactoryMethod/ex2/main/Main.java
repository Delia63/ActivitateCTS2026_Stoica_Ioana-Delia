package Creationale.FactoryMethod.ex2.main;

import Creationale.FactoryMethod.ex2.clase.Client;
import Creationale.FactoryMethod.ex2.fabrici.FactoryClient;
import Creationale.FactoryMethod.ex2.fabrici.FactoryFizica;
import Creationale.FactoryMethod.ex2.fabrici.FactoryJuridica;

public class Main {
    static void main(String[] args) {
        FactoryClient factoryJuridica = new FactoryJuridica();
        Client client1 = factoryJuridica.creareClient("Ion");
        client1.afisareDetalii();

        FactoryClient factoryFizica = new FactoryFizica();
        Client client2 = factoryFizica.creareClient("Laura");
        client2.afisareDetalii();

    }
}
