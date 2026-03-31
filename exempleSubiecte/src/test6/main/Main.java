package test6.main;

import test6.Builder.clase.IPachetBuilder;
import test6.Builder.clase.PachetBuilder;
import test6.Builder.clase.PachetLivrare;
import test6.FactoryMethod.clase.Produs;
import test6.FactoryMethod.fabrici.ProdusFactory;
import test6.FactoryMethod.fabrici.SmartphoneFactory;

public class Main {
    static void main(String[] args) {
        ProdusFactory smartphoneFactory = new SmartphoneFactory();
        Produs smartphone = smartphoneFactory.createProdus("Samsung");
        smartphone.afisareSpecificatii();

        PachetBuilder builder = new PachetBuilder();
        PachetLivrare pachetLivrare = builder.setImpachetareCadou(true).setMesajPersonalizat("La multi ani!").build();
        System.out.println(pachetLivrare);
    }
}
