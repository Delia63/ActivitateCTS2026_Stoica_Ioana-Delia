package Comportamentale.Strategy.agentie.clase;

public class Cash implements ModPlata{

    @Override
    public void plateste(String numeClient, double sumaPlata) {
        System.out.println(numeClient + " plateste prin cash suma de "+sumaPlata+" RON");
    }
}
