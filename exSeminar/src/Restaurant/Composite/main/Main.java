package Restaurant.Composite.main;

import Restaurant.Composite.clase.Item;
import Restaurant.Composite.clase.Sectiune;
import Restaurant.Composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura meniu = new Sectiune("Meniu");
        Structura starter = new Sectiune("Starter");
        Structura bauturi = new Sectiune("Bauturi");
        Structura sucuri = new Sectiune("Sucuri");
        Structura cafea = new Sectiune("Cafea");
        Structura fanta = new Item("Fanta");
        Structura pepsi = new Item("Pepsi");
        Structura latte = new Item("Latte");

        ((Sectiune) meniu).adaugaStructura(starter);
        ((Sectiune) meniu).adaugaStructura(bauturi);
        ((Sectiune) bauturi).adaugaStructura(sucuri);
        ((Sectiune) bauturi).adaugaStructura(cafea);
        ((Sectiune) sucuri).adaugaStructura(fanta);
        ((Sectiune) sucuri).adaugaStructura(pepsi);
        ((Sectiune) cafea).adaugaStructura(latte);

        meniu.descriere(" ");
        System.out.println(((Sectiune) meniu).getStructura(1));
        ((Sectiune) bauturi).stergeStructura(cafea);
        System.out.println();
        meniu.descriere(" ");
    }
}
