package Spital.Prototype.main;

import Restaurant.Prototype.clase.Rezervare;
import Spital.Prototype.clase.IReteta;
import Spital.Prototype.clase.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {
        Map<String, Double> cantitateParacetamol = new HashMap<>();
        cantitateParacetamol.put("Apa", 5.5);
        cantitateParacetamol.put("Substanta activa", 10.5);

        Reteta reteta1 = new Reteta("Paracetamol", cantitateParacetamol);
        System.out.println(reteta1);

        Reteta reteta2 = (Reteta) reteta1.copiaza();
        System.out.println(reteta2);
    }
}
