package Comportamentale.Strategy.hotel.clase;

public class VerificareUE implements ModVerificare{
    @Override
    public void verificaActe(String nume) {
        System.out.println("Am verificat buletinul lui " + nume);
    }
}
