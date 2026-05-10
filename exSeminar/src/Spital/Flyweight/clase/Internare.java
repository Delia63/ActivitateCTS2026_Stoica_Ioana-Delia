package Spital.Flyweight.clase;

public class Internare {
    private int nrSalon;
    private int nrPat;
    private int nrZileInternare;

    public Internare(int nrSalon, int nrPat, int nrZileInternare) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileInternare = nrZileInternare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("nrSalon=").append(nrSalon);
        sb.append(", nrPat=").append(nrPat);
        sb.append(", nrZileInternare=").append(nrZileInternare);
        sb.append('}');
        return sb.toString();
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZileInternare() {
        return nrZileInternare;
    }
}
