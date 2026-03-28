package Creationale.Builder.ex2.clase;

public class Rezervare {
    private String numeClient;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;

    public Rezervare(String numeClient, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzicaAmbientala) {
        this.numeClient = numeClient;
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzicaAmbientala = muzicaAmbientala;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", bauturaRacoritoare=").append(bauturaRacoritoare);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append('}');
        return sb.toString();
    }
}
