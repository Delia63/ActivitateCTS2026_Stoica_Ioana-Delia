package Restaurant.Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String, IClient> clienti = new HashMap<>();

    public IClient getClient(String nume, String nrTelefon, String email) {
        IClient clientCautat = clienti.get(nrTelefon);
        if(clientCautat == null) {
            clientCautat = new Client(nume, nrTelefon, email);
            clienti.put(nrTelefon, clientCautat);
        }

        return clientCautat;
    }
}
