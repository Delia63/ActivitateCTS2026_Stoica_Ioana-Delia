package Structurale.Adapter.ex1.main;

import Structurale.Adapter.ex1.clase.*;

public class Main {
    public static void main(String[] args) {
        ILeasing leasing = new Leasing();
        leasing.acordaLeasing();
        IBanca banca = new Banca();
        banca.acordaCredit();
        System.out.println();
        IBanca adapterLeasingBanca = new AdapterLeasingBanca(leasing);
        adapterLeasingBanca.acordaCredit();
    }
}
