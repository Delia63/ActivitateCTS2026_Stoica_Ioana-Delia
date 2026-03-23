package Creationale.SimpleFactory.ex3.main;

import Creationale.SimpleFactory.ex3.clase.Piesa;
import Creationale.SimpleFactory.ex3.factory.PiesaFactory;
import Creationale.SimpleFactory.ex3.factory.TipOrigine;

public class Main {
    static void main(String[] args) {
        PiesaFactory factory = new PiesaFactory();

        Piesa piesa1 = factory.getPiesa(TipOrigine.Originala, 1);
        Piesa piesa2 = factory.getPiesa(TipOrigine.Aftermarket, 2);
        Piesa piesa3 = factory.getPiesa(TipOrigine.SH, 3);

        piesa1.descriere();
        piesa2.descriere();
        piesa3.descriere();
    }



}
