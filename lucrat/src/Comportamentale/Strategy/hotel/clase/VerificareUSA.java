package Comportamentale.Strategy.hotel.clase;

public class VerificareUSA implements ModVerificare{
    @Override
    public void verificaActe(String nume) {
        System.out.println("Am verificat viza lui "+nume);
    }
}
