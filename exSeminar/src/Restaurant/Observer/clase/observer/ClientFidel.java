package Restaurant.Observer.clase.observer;

public class ClientFidel implements Client{
    private String nume;
    private String nrTelefon;

    public ClientFidel(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + this.nume
                + " cu nr de telefon " + this.nrTelefon
                + " a primit mesajul: " + mesaj);
    }
}
