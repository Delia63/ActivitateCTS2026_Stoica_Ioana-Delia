package STB.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda) {
        comenzi.add(comanda);
    }

    public void executaComanda() {
        if(comenzi.get(0) != null) {
            comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }
    }
}
