package Structurale.Composite.ex1.main;

import Structurale.Composite.ex1.clase.Loc;
import Structurale.Composite.ex1.clase.Sectiune;
import Structurale.Composite.ex1.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura stadion = new Sectiune("Stadion");
        Structura tribuna = new Sectiune("Tribuna");
        Structura peluza = new Sectiune("Peluza");
        Structura peluzaL = new Sectiune("Peluza Latina");
        Structura tribunaN = new Sectiune("Tribuna Nord");
        Structura tribunaS = new Sectiune("Tribuna Sud");
        Structura loc1 = new Loc(1);
        Structura loc2 = new Loc(2);
        Structura loc3 = new Loc(3);
        Structura loc4 = new Loc(4);
        Structura loc5 = new Loc(5);
        Structura loc6 = new Loc(6);

        ((Sectiune) stadion).adaugaStructura(tribuna);
        ((Sectiune) stadion).adaugaStructura(peluza);
        ((Sectiune) tribuna).adaugaStructura(tribunaN);
        ((Sectiune) tribuna).adaugaStructura(tribunaS);
        ((Sectiune) peluza).adaugaStructura(peluzaL);
        ((Sectiune) tribunaN).adaugaStructura(loc1);
        ((Sectiune) tribunaS).adaugaStructura(loc2);
        ((Sectiune) tribunaS).adaugaStructura(loc3);
        ((Sectiune) peluzaL).adaugaStructura(loc4);
        ((Sectiune) peluzaL).adaugaStructura(loc5);
        ((Sectiune) peluzaL).adaugaStructura(loc6);

        stadion.descriereSectiune(" ");
    }
}
