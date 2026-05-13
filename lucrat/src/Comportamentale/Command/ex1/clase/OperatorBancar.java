package Comportamentale.Command.ex1.clase;

import Comportamentale.Command.ex1.clase.claseCommand.IComanda;

import java.util.ArrayList;
import java.util.List;

public class OperatorBancar {
    private List<IComanda> listaComenzi;

    public OperatorBancar() {
        this.listaComenzi = new ArrayList<IComanda>();
    }

    public void inregistrareComanda(IComanda comanda) {
        listaComenzi.add(comanda);
    }

    public void executaComana() {
        if(listaComenzi.size() > 0) {
            listaComenzi.get(0).executa();
            listaComenzi.remove(0);
        }
    }
}
