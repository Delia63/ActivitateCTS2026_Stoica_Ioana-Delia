package Restaurant.Observer.main;

import Restaurant.Observer.clase.observabil.Registru;
import Restaurant.Observer.clase.observabil.RegistruClienti;
import Restaurant.Observer.clase.observer.Client;
import Restaurant.Observer.clase.observer.ClientFidel;

public class Main {
    public static void main(String[] args) {
        Client client1 = new ClientFidel("Mircea", "072345678967");
        Client client2 = new ClientFidel("Lucia", "0745362718");

        Registru registruClienti = new RegistruClienti();
        registruClienti.abonareClient(client1);
        registruClienti.abonareClient(client2);
        ((RegistruClienti) registruClienti).trimiteNotificareOfertaPret();
    }
}
