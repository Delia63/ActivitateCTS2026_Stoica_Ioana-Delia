package STB.Command.main;

import STB.Command.clase.Autobuz;
import STB.Command.clase.Command;
import STB.Command.clase.Cursa;
import STB.Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        operator.adaugaComanda(new Cursa(new Autobuz("B302BXA"), 21));
        operator.adaugaComanda(new Cursa(new Autobuz("B123ABC"), 103));
        operator.adaugaComanda(new Cursa(new Autobuz("B345GFH"), 106));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
//        operator.executaComanda();
    }
}
