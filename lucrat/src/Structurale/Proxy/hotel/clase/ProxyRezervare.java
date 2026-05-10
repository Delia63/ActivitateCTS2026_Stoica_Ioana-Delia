package Structurale.Proxy.hotel.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public Rezervare getRezervare() {
        return rezervare;
    }

    public void setRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }


    @Override
    public void anulareRezervare() {
        if(rezervare.getNrNopti() == 1) {
            rezervare.anulareRezervare();
        }
        else {
            System.out.println("Anularea nu este permisa");
        }
    }
}
