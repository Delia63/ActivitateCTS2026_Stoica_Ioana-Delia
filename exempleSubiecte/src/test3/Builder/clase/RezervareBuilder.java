package test3.Builder.clase;

import test2.Builder.clase.RezervareBuiler;

public class RezervareBuilder implements IRezervareBuilder{
    private boolean masaGeam;
    private boolean scaunCopil;
    private boolean decoratiuniFlorale;

    public RezervareBuilder() {
        this.masaGeam = false;
        this.scaunCopil = false;
        this.decoratiuniFlorale = false;
    }

    public RezervareBuilder setMasaGeam(boolean masaGeam) {
        this.masaGeam = masaGeam;
        return this;
    }

    public RezervareBuilder setScaunCopil(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
        return this;
    }

    public RezervareBuilder setDecoratiuniFlorale(boolean decoratiuniFlorale) {
        this.decoratiuniFlorale = decoratiuniFlorale;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.masaGeam, this.scaunCopil, this.decoratiuniFlorale);
    }
}
