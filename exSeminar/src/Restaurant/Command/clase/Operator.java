package Restaurant.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaRezervari;

    public Operator() {
        this.listaRezervari = new ArrayList<>();
    }

    public void inregistreazaRezervare(Command comandaRezervare) {
        listaRezervari.add(comandaRezervare);
    }

    public void executaRezervare() {
        if(listaRezervari.size() > 0) {
            listaRezervari.get(0).executa();
            listaRezervari.remove(0);
        }
    }
}
