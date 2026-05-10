package Comportamentale.Strategy.agentie.main;

import Comportamentale.Strategy.agentie.clase.Client;
import Comportamentale.Strategy.agentie.clase.ModPlata;
import Comportamentale.Strategy.agentie.clase.PayPal;

public class Main {
    static void main(String[] args) {
        Client client1 = new Client("Popescu");
        client1.plateste(100);

        client1.setModPlata(new PayPal());
        client1.plateste(200);
    }
}
