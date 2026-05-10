package Comportamentale.Strategy.hotel.main;

import Comportamentale.Strategy.hotel.clase.Client;
import Comportamentale.Strategy.hotel.clase.VerificareUE;
import Comportamentale.Strategy.hotel.clase.VerificareUSA;

public class Main {
    static void main(String[] args) {
        Client client1 = new Client("Popescu",new VerificareUE());
        client1.verificaActe();
        client1.setModVerificare(new VerificareUSA());
        client1.verificaActe();
    }
}
