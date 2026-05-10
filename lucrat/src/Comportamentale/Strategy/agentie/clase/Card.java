package Comportamentale.Strategy.agentie.clase;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste prin card suma de "+sumaPlata+" RON");
    }
}
