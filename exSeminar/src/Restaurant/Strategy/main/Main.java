package Restaurant.Strategy.main;

import Restaurant.Strategy.clase.Client;
import Restaurant.Strategy.clase.ModalitatePlata;
import Restaurant.Strategy.clase.PlataCard;
import Restaurant.Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Mircea");
        client.platesteSuma(100.0);
        client.setStrategiePlata(new PlataCash());
        client.platesteSuma(120.0);
    }
}
