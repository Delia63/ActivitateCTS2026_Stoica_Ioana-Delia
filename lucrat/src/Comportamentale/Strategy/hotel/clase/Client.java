package Comportamentale.Strategy.hotel.clase;

public class Client {
    private String nume;
    private ModVerificare modVerificare;

    public Client(String nume, ModVerificare modVerificare) {
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaActe() {
        modVerificare.verificaActe(this.nume);
    }
}
