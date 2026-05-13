package STB.Proxy.clase;

public class Autobuz implements IAutobuz{
    private int nrLinie;
    private String model;
    private int nrPersoane;

    public Autobuz(int nrLinie, String model, int nrPersoane) {
        this.nrLinie = nrLinie;
        this.model = model;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void oprireInStatie() {
        System.out.println("Autobuzul cu linia " + this.nrLinie
                + " si modelul " + this.model
                + " a oprit in statie, deoarece are "
                + this.nrPersoane + " persoane.");
    }
}
