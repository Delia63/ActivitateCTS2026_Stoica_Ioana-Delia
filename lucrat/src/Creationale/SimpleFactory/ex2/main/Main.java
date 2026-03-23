package Creationale.SimpleFactory.ex2.main;

import Creationale.SimpleFactory.ex2.clase.Pizza;
import Creationale.SimpleFactory.ex2.factory.PizzaFactory;
import Creationale.SimpleFactory.ex2.factory.TipPizza;

public class Main {
    static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza pizza = factory.getPizza(TipPizza.Diavola, 25.5f, 5);
        Pizza pizza1 = factory.getPizza(TipPizza.Margherita, 20, 3);
        Pizza pizza2 = factory.getPizza(TipPizza.QuattroStagioni, 30.5f, 6);

        pizza.descriere();
        pizza1.descriere();
        pizza2.descriere();
    }
}
