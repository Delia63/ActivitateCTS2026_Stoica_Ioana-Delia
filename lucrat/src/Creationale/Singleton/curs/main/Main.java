package Creationale.Singleton.curs.main;

import Creationale.Singleton.curs.clase.Agentie;

public class Main {
    public void main(String[] args) {
        Agentie agentie = Agentie.getInstance("Delia Tur", 200000, 5);
        System.out.println(agentie.getNumeAgentie());

        Agentie agentie1 = Agentie.getInstance("Luca Tur", 100000,6);
        System.out.println(agentie1.getCapital());
    }
}
