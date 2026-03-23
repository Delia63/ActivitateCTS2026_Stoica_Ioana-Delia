package Creationale.Singleton.ex1.main;

import Creationale.Singleton.ex1.clase.CasaMarcat;

public class Main {
    static void main(String[] args) {
        CasaMarcat casaMarcat = CasaMarcat.getInstance(10000);
        System.out.println(casaMarcat.getSumaTotala());
        System.out.println(casaMarcat.toString());
    }
}
