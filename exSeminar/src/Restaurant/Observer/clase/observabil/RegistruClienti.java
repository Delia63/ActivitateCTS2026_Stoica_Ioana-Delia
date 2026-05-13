package Restaurant.Observer.clase.observabil;

import Restaurant.Observer.clase.observer.Client;

import java.util.ArrayList;
import java.util.List;

public class RegistruClienti implements Registru{
    private List<Client> listaClienti;

    public RegistruClienti() {
        this.listaClienti = new ArrayList<Client>();
    }

    @Override
    public void abonareClient(Client client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareClient(Client client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificaClient(String mesaj) {
        for(Client client : listaClienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void trimiteNotificareOfertaPret() {
        notificaClient("Oferta de pret!");
    }

    public void trimiteNotificareMeniuNou() {
        notificaClient("S-a introdus un meniu nou!");
    }
}
