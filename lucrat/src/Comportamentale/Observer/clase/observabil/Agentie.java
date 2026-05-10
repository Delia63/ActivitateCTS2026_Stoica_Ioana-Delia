package Comportamentale.Observer.clase.observabil;

import Comportamentale.Observer.clase.observer.IClient;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements IAgentie{
    private String nume;
    private List<IClient> listaClienti;

    public Agentie(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(IClient client) {
        listaClienti.remove(client);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IClient client : listaClienti) {
            client.receptioneazaMesaj(this.nume+": "+mesaj);
        }
    }

    public void notificareReducerePret() {
        trimiteNotificare("Preturile au fost reduse. Consultati noul nostru catalog!");
    }

    public void notificareOfertaPachet() {
        trimiteNotificare("A fost adaugata o noua oferta. Consultati noul nostru catalog!");
    }
}
