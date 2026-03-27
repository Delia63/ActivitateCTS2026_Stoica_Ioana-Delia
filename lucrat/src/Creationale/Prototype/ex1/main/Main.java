package Creationale.Prototype.ex1.main;

import Creationale.Prototype.ex1.clase.Cont;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, Boolean> documente = new HashMap<String, Boolean>();
        documente.put("Buletin", true);
        documente.put("Cerere", true);

        Cont cont1 = new Cont("Mihai", documente);
        Cont cont2 = (Cont) cont1.copiaza();
        System.out.println(cont1);
        System.out.println(cont2);

    }
}
