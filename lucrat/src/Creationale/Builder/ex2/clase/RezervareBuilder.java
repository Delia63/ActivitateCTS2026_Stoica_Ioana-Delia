package Creationale.Builder.ex2.clase;

public class RezervareBuilder implements InterfaceBuilder{
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;

    public RezervareBuilder() {
        this.mancareInclusa = false;
        this.scaunErgonomic = false;
        this.bauturaRacoritoare = false;
        this.muzicaAmbientala = false;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    @Override
    public Rezervare build(String numeClient) {
        return new Rezervare(numeClient, this.mancareInclusa, this.scaunErgonomic, this.bauturaRacoritoare, this.muzicaAmbientala);
    }
}
