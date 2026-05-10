package Comportamentale.Strategy.hotel.clase;

public class VerificareNonUE implements ModVerificare{
    @Override
    public void verificaActe(String nume) {
        System.out.println("Am verificat pasaportul lui "+nume);
    }
}
