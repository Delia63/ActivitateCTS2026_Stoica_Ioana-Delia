package STB.Strategy.main;
import STB.Strategy.clase.Calator;
import STB.Strategy.clase.CardBancar;

public class Main {
    static void main(String[] args) {
        Calator calator = new Calator("Radu");
        calator.platesteCalatorie();

        calator.setModPlata(new CardBancar());
        calator.platesteCalatorie();
    }
}
