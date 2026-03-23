package Creationale.SimpleFactory.ex2.factory;

import Creationale.SimpleFactory.ex2.clase.Diavola;
import Creationale.SimpleFactory.ex2.clase.Margherita;
import Creationale.SimpleFactory.ex2.clase.Pizza;
import Creationale.SimpleFactory.ex2.clase.QuattroStagioni;

public class PizzaFactory {
    public Pizza getPizza(TipPizza tipPizza, float pret, int nrIngrediente) {
        return switch (tipPizza) {
            case TipPizza.Diavola -> new Diavola(pret, nrIngrediente);
            case TipPizza.Margherita -> new Margherita(pret, nrIngrediente);
            case TipPizza.QuattroStagioni -> new QuattroStagioni(pret, nrIngrediente);
            default -> null;
        };
    }
}
