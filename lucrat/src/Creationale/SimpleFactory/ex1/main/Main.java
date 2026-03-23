package Creationale.SimpleFactory.ex1.main;

import Creationale.SimpleFactory.ex1.clase.TitluCalatorie;
import Creationale.SimpleFactory.ex1.factory.BiletFactory;
import Creationale.SimpleFactory.ex1.factory.TipTitlu;

public class Main {
    static void main(String[] args) {
        BiletFactory factory = new BiletFactory();

        TitluCalatorie titluCalatorie = factory.getBilet(TipTitlu.ABONAMENT);
        titluCalatorie.descriere();

        TitluCalatorie titluCalatorie1 = factory.getBilet(TipTitlu.SMS);
        titluCalatorie1.descriere();

    }
}
