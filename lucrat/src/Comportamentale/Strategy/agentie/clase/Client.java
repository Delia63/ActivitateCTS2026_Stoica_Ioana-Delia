package Comportamentale.Strategy.agentie.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Card();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaPlata) {
        this.modPlata.plateste(this.nume, sumaPlata);
    }
}
