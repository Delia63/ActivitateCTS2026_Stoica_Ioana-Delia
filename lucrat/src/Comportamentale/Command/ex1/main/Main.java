package Comportamentale.Command.ex1.main;

import Comportamentale.Command.ex1.clase.ContBancar;
import Comportamentale.Command.ex1.clase.OperatorBancar;
import Comportamentale.Command.ex1.clase.claseCommand.ComandaConstituire;
import Comportamentale.Command.ex1.clase.claseCommand.ComandaDepunere;
import Comportamentale.Command.ex1.clase.claseCommand.ComandaRetragere;
import Comportamentale.Command.ex1.clase.claseCommand.IComanda;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("Delia", 200);
        IComanda comandaConstituire = new ComandaConstituire(contBancar, 200);
        IComanda comandaDepunere = new ComandaDepunere(contBancar, 100);
        IComanda comandaRetragere = new ComandaRetragere(contBancar, 200);

        OperatorBancar operatorBancar = new OperatorBancar();
        operatorBancar.inregistrareComanda(comandaConstituire);
        operatorBancar.inregistrareComanda(comandaDepunere);
        operatorBancar.inregistrareComanda(comandaRetragere);
        operatorBancar.executaComana();
        operatorBancar.executaComana();
        operatorBancar.executaComana();

    }
}
