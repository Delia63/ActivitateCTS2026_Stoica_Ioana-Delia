package Creationale.SimpleFactory.ex5.main;

import Creationale.SimpleFactory.ex5.clase.Jucator;
import Creationale.SimpleFactory.ex5.fabrica.FactoryJucator;
import Creationale.SimpleFactory.ex5.fabrica.TipJucator;

public class Main {
    static void main(String[] args) {
        FactoryJucator factory = new FactoryJucator();
        Jucator fundas = factory.getJucator(TipJucator.Fundas, 12, "Luca", 34);
        Jucator portar = factory.getJucator(TipJucator.Portar, 23, "Lucian", 21);
        Jucator atacant = factory.getJucator(TipJucator.Atacant, 14, "Mircea", 29);

        fundas.descriere();
        portar.descriere();
        atacant.descriere();
    }
}
