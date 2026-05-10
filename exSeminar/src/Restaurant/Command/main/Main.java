package Restaurant.Command.main;

import Restaurant.Command.clase.ComandaRezervare;
import Restaurant.Command.clase.Command;
import Restaurant.Command.clase.Masa;
import Restaurant.Command.clase.Operator;

public class Main {
    static void main(String[] args) {
        Masa masa1 = new Masa(1);
        Masa masa2 = new Masa(2);

        Command comandaRezervare1 = new ComandaRezervare(masa1);
        Command commandRezervare2 = new ComandaRezervare(masa2);

        Operator operator = new Operator();
        operator.inregistreazaRezervare(comandaRezervare1);
        operator.inregistreazaRezervare(commandRezervare2);
        operator.executaRezervare();
    }
}
