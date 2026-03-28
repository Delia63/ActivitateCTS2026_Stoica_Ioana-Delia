package Creationale.Prototype.ex2.clase;

import java.util.HashMap;
import java.util.Map;

public class Client implements IClient{
    private String nume;
    private Map<String, Boolean> listaOptiuni;

    public Client(String nume, Map<String, Boolean> listaOptiuni) {
        this.nume = nume;
        this.listaOptiuni = listaOptiuni;
    }

    private Client() {

    }

    @Override
    public IClient copiaza() {
        Client client = new Client();
        client.nume = this.nume;
        client.listaOptiuni = new HashMap<String, Boolean>(this.listaOptiuni);

        return client;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaOptiuni=").append(listaOptiuni);
        sb.append('}');
        return sb.toString();
    }
}
