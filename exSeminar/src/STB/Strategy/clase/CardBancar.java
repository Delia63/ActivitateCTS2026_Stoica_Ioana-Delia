package STB.Strategy.clase;

public class CardBancar implements ModPlata{
    @Override
    public void platesteCalatorie(String numeCalator) {
        System.out.println("Calatorul "+numeCalator+" a platit biletul prin cardul bancar.");
    }
}
