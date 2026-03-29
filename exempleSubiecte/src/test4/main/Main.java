package test4.main;

import test4.Prototype.clase.Reteta;
import test4.Singleton.ConfiguratieSpital;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        ConfiguratieSpital configuratieSpital = ConfiguratieSpital.getInstanta("http://localhost:3000", 13);
        configuratieSpital.afisareStatus();

        Map<String, Double> listaMedicamente = new HashMap<String, Double>();
        listaMedicamente.put("Nurofen", 12.5d);
        listaMedicamente.put("Paracetamol", 10d);

        Reteta reteta1 = new Reteta(listaMedicamente);
        Reteta reteta2 = (Reteta) reteta1.copiaza();
        System.out.println(reteta1);
        System.out.println(reteta2);

        ConfiguratieSpital configuratieSpital1 = ConfiguratieSpital.getInstanta("http://localhost:8000", 14);
        configuratieSpital1.afisareStatus();
    }
}
