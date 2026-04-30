package Restaurant.Flyweight.clase;

public class Client implements IClient{
    private String nume;
    private String nrTelefon;
    private String email;

    protected Client(String nume, String nrTelefon, String email) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.email = email;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul "+this.nume+" cu nr de telefon "+this.nrTelefon+
                " si emailul "+this.email+" are urmatoarea rezervare:");
        System.out.println(rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, Double taxaPerPersoana) {
        System.out.println("Clientul "+this.nume+" trebuie sa plateasca "+ rezervare.getNrPersoane()*taxaPerPersoana+" lei.");
    }
}
