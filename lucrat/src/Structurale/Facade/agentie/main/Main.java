package Structurale.Facade.agentie.main;

import Structurale.Facade.agentie.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.rezervaPachetTuristic("Ploiesti","Bucuresti");
        System.out.println("\n");
        facade.rezervaPachetTuristic("Cluj","Iasi");
    }
}
