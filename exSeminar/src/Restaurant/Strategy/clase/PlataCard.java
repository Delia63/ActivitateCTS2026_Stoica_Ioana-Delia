package Restaurant.Strategy.clase;

public class PlataCard implements ModalitatePlata{
    @Override
    public void plateste(String numeClient, Double sumaPlata) {
        System.out.println("Clientul "+numeClient+" plateste suma de "+sumaPlata+" de lei cu cardul.");
    }
}
