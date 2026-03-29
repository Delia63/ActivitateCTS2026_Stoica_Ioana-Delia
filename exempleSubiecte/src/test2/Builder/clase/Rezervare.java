package test2.Builder.clase;

public class Rezervare {
    private String numeClient;
    private boolean cascaProtectie;
    private boolean cosCumparaturi;
    private boolean asigurareAccidente;
    private  int nrKm;

    public Rezervare(String numeClient, boolean cascaProtectie, boolean cosCumparaturi, boolean asigurareAccidente, int nrKm) {
        this.numeClient = numeClient;
        this.cascaProtectie = cascaProtectie;
        this.cosCumparaturi = cosCumparaturi;
        this.asigurareAccidente = asigurareAccidente;
        this.nrKm = nrKm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", cascaProtectie=").append(cascaProtectie);
        sb.append(", cosCumparaturi=").append(cosCumparaturi);
        sb.append(", asigurareAccidente=").append(asigurareAccidente);
        sb.append(", nrKm=").append(nrKm);
        sb.append('}');
        return sb.toString();
    }
}
