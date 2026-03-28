package Creationale.FactoryMethod.ex3.main;

import Creationale.FactoryMethod.ex3.clase.Jucator;
import Creationale.FactoryMethod.ex3.fabrici.FactoryAtacant;
import Creationale.FactoryMethod.ex3.fabrici.FactoryFundas;
import Creationale.FactoryMethod.ex3.fabrici.FactoryJucator;
import Creationale.FactoryMethod.ex3.fabrici.FactoryPortar;

public class Main {
    static void main(String[] args) {
        FactoryJucator factoryAtacant = new FactoryAtacant();
        Jucator atacant = factoryAtacant.getJucator(12, "Lucas",29);
        atacant.descriere();

        FactoryJucator factoryFundas = new FactoryFundas();
        Jucator fundas = factoryFundas.getJucator(13, "Marius",25);
        fundas.descriere();

        FactoryJucator factoryPortar = new FactoryPortar();
        Jucator portar = factoryPortar.getJucator(14, "Mircea",30);
        portar.descriere();
    }
}
