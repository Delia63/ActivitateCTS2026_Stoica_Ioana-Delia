package Creationale.Builder.ex1.main;

import Creationale.Builder.ex1.clase.Cont;
import Creationale.Builder.ex1.clase.ContBuilder;
import Creationale.Builder.ex1.clase.InterfaceContBuilder;

public class Main {
    static void main(String[] args) {
        ContBuilder builder = new ContBuilder();
        Cont cont1 = builder.setContSalariu(true).setCardAtasat(true).build("Mihai");
        System.out.println(cont1);
        Cont cont2 = builder.setContSalariu(false).setInternetBanking(true).build("Maria");
        System.out.println(cont2);
    }
}
