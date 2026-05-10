package Comportamentale.Observer.main;


import Comportamentale.Observer.clase.observabil.Agentie;
import Comportamentale.Observer.clase.observabil.IAgentie;
import Comportamentale.Observer.clase.observer.Client;
import Comportamentale.Observer.clase.observer.IClient;

public class Main {
    static void main(String[] args) {
        IClient client1 = new Client("Popescu");
        IClient client2 = new Client("Radu");
        IClient client3 = new Client("Maria");

        IAgentie agentie = new Agentie("RoTurism");
        agentie.abonareClient(client1);
        agentie.abonareClient(client2);
        ((Agentie) agentie).notificareReducerePret();
        agentie.dezabonareClient(client1);
        agentie.abonareClient(client3);
        ((Agentie) agentie).notificareOfertaPachet();

    }
}
