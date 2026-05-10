package STB.Strategy.clase;

public class SMS implements ModPlata{
    @Override
    public void platesteCalatorie(String numeCalator) {
        System.out.println("Calatorul "+numeCalator+" a platit biletul prin SMS.");
    }
}
