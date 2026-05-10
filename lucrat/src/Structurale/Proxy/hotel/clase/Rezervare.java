package Structurale.Proxy.hotel.clase;

public class Rezervare implements IRezervare{
    private int nrRezervare;
    private int nrNopti;

    public Rezervare(int nrRezervare, int nrNopti) {
        this.nrRezervare = nrRezervare;
        this.nrNopti = nrNopti;
    }

    public int getNrRezervare() {
        return nrRezervare;
    }

    public int getNrNopti() {
        return nrNopti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrRezervare=").append(nrRezervare);
        sb.append(", nrNopti=").append(nrNopti);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervare cu codul "+nrRezervare+" a fost anulata.");
    }
}
