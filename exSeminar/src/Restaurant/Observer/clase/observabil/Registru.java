package Restaurant.Observer.clase.observabil;

import Restaurant.Observer.clase.observer.Client;

import java.util.ArrayList;
import java.util.List;

public interface Registru {
    public void abonareClient(Client client);

    public void dezabonareClient(Client client);

    public void notificaClient(String mesaj);
}
