package Structurale.Flyweight.agentie.main;

import Structurale.Flyweight.agentie.clase.FabricaDePachete;
import Structurale.Flyweight.agentie.clase.IPachetTuristic;
import Structurale.Flyweight.agentie.clase.Optionale;

public class Main {
    static void main(String[] args) {
        FabricaDePachete fabricaDePachete = new FabricaDePachete();

        Optionale op1 = new Optionale(true, 5);
        Optionale op2 = new Optionale(false, 3);
        Optionale op3 = new Optionale(true, 2);
        Optionale op4 = new Optionale(false, 1);
        Optionale op5 = new Optionale(true, 0);

        IPachetTuristic pachetTuristic1 = fabricaDePachete.getPachetTuristic(1, "Elixir", "Busteni");
        pachetTuristic1.descriePachet(op4);
        System.out.println();
        IPachetTuristic pachetTuristic2 = fabricaDePachete.getPachetTuristic(2, "Afrodita", "Predeal");
        pachetTuristic2.descriePachet(op2);
    }
}
