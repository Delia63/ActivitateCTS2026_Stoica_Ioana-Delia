package test3.main;

import test2.Builder.clase.RezervareBuiler;
import test3.Builder.clase.Rezervare;
import test3.Builder.clase.RezervareBuilder;
import test3.FactoryMethod.clase.IMeniu;
import test3.FactoryMethod.clase.MeniuVegan;
import test3.FactoryMethod.fabrici.MeniuFactory;
import test3.FactoryMethod.fabrici.MeniuVeganFactory;

public class Main {
    public static void main(String[] args) {
        MeniuFactory factoryVegan = new MeniuVeganFactory();
        IMeniu meniuVegan = new MeniuVegan();
        meniuVegan.afisareIngrediente();

        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setMasaGeam(true).setDecoratiuniFlorale(true).build("Lora");
        System.out.println(rezervare);

    }
}
