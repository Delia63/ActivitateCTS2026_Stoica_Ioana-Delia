package Creationale.Singleton.ex3.main;

import Creationale.Singleton.ex3.clase.DispeceratDepou;

public class Main {
    static void main(String[] args) {
        DispeceratDepou dispeceratDepou = DispeceratDepou.getInstance("Depou 1", 50);
        System.out.println(dispeceratDepou.getNumeDepou());

        DispeceratDepou dispeceratDepou1 = DispeceratDepou.getInstance("Depou 2", 20);
        System.out.println(dispeceratDepou1.getNumeDepou());
    }
}
