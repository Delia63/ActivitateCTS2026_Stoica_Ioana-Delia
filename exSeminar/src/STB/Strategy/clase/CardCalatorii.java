package STB.Strategy.clase;

import Restaurant.Strategy.clase.ModalitatePlata;

public class CardCalatorii implements ModPlata {
    @Override
    public void platesteCalatorie(String numeCalator) {
        System.out.println("Calatorul "+numeCalator+" a platit biletul prin cardul de calatorii.");
    }
}
