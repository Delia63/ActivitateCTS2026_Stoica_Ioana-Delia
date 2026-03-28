package Creationale.Builder.ex2.main;

import Creationale.Builder.ex2.clase.InterfaceBuilder;
import Creationale.Builder.ex2.clase.Rezervare;
import Creationale.Builder.ex2.clase.RezervareBuilder;

public class Main {
    static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setScaunErgonomic(true).setBauturaRacoritoare(true).build("Delia");
        Rezervare rezervare2 = builder.setScaunErgonomic(false).setBauturaRacoritoare(false).build("Luca");

        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
