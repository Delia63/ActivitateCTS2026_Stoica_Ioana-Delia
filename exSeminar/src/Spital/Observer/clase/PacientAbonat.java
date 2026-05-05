package Spital.Observer.clase;

public class PacientAbonat implements Pacient{
    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul "+this.nume+" cu varsta "+this.varsta+" de ani a primit notificare cu mesajul:"+mesaj);
    }
}
