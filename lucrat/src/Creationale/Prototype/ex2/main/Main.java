package Creationale.Prototype.ex2.main;

import Creationale.Prototype.ex2.clase.Client;
import Creationale.Prototype.ex2.clase.IClient;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, Boolean> listaOptiuni = new HashMap<String, Boolean>();
        listaOptiuni.put("Mancare inclusa", true);
        listaOptiuni.put("Scaun ergonomic", true);
        listaOptiuni.put("Bautura racoritoare", true);
        listaOptiuni.put("Muzica ambientala", false);

        IClient client1 = new Client("Mario", listaOptiuni);
        System.out.println(client1);

        IClient client2 = client1.copiaza();
        System.out.println(client2);
    }
}
