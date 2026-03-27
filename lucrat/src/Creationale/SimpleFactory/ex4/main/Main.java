package Creationale.SimpleFactory.ex4.main;

import Creationale.SimpleFactory.ex4.clase.Credit;
import Creationale.SimpleFactory.ex4.clase.CreditIpotecar;
import Creationale.SimpleFactory.ex4.fabrica.FactoryCredit;
import Creationale.SimpleFactory.ex4.fabrica.TipCredit;

public class Main {
    static void main(String[] args) {
        FactoryCredit factoryCredit = new FactoryCredit();
        Credit creditNevoiPersonale = factoryCredit.createCredit(TipCredit.NevoiPersonale, "Delia", 10000d);
        Credit creditIpotecare = factoryCredit.createCredit(TipCredit.Ipotecare, "Mario", 20000d);

        creditNevoiPersonale.descriere();
        creditIpotecare.descriere();
    }
}
