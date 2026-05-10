package Restaurant.Proxy.clase;

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
    public void realizeazaRezervare() {
        if(this.rezervare.getNrPersoane() >= 4) {
            rezervare.realizeazaRezervare();
        }
        else {
            System.out.println("Rezervarea poate fi facuta doar pt min 4 persoane.");
        }
    }
}
