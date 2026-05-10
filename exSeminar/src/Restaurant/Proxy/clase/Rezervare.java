package Restaurant.Proxy.clase;

public class Rezervare implements IRezervare{
    private int nrRezervare;
    private String numeClient;
    private int nrPersoane;

    public Rezervare(int nrRezervare, String numeClient, int nrPersoane) {
        this.nrRezervare = nrRezervare;
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public int getNrRezervare() {
        return nrRezervare;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void realizeazaRezervare() {
        System.out.println("Clientul "+this.numeClient
                +" are rezervarea nr "+this.nrRezervare
                +" pentru "+this.nrPersoane+" persoane.");
    }
}
