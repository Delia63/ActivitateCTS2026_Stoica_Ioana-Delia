package Restaurant.Builder.clase;

public class RezervareBuilder implements InterfaceRezervareBuilder{
    private boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;

    public RezervareBuilder() {
        this.asezareLaGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaAmbientala = false;
    }

    public RezervareBuilder setAsezareLaGeam(boolean asezareLaGeam) {
        this.asezareLaGeam = asezareLaGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.asezareLaGeam, this.scauneErgonomice, this.decorareMasa, this.muzicaAmbientala);
    }
}
