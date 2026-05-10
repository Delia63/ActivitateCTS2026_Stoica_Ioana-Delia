package Structurale.Proxy.agentie.clase;

public class PachetTransport implements PachetTuristic{
    private Persoana persoana;

    public PachetTransport(Persoana persoana) {
        this.persoana = persoana;
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public void setPersoana(Persoana persoana) {
        this.persoana = persoana;
    }

    @Override
    public void descrierePachet() {
        System.out.println("Acest pachet inlude doar transport");
    }

    @Override
    public void rezervaPachet() {
        System.out.println(persoana.getNume() + " a rezervat un pachet de transport");
    }
}
