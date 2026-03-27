package Creationale.SimpleFactory.ex4.fabrica;

import Creationale.SimpleFactory.ex4.clase.Credit;
import Creationale.SimpleFactory.ex4.clase.CreditIpotecar;
import Creationale.SimpleFactory.ex4.clase.CreditNevoiPersonale;

public class FactoryCredit {
    public Credit createCredit(TipCredit tipCredit, String numeClient, Double sumaCredit) {
        return switch (tipCredit) {
            case TipCredit.NevoiPersonale -> new CreditNevoiPersonale(numeClient, sumaCredit);
            case TipCredit.Ipotecare -> new CreditIpotecar(numeClient, sumaCredit);
            default -> null;
        };
    }
}
