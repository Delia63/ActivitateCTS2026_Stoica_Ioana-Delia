package Comportamentale.Strategy.agentie.clase;

public class PayPal implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste prin PayPal suma de "+sumaPlata+" RON");
    }
}
