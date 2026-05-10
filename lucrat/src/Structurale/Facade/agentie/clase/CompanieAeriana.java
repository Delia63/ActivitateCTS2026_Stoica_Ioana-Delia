package Structurale.Facade.agentie.clase;

public class CompanieAeriana {
    private String nume;

    public CompanieAeriana(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompanieAeriana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Zbor rezervaBiletAvion(String plecare, String destinatie) {
        Zbor zbor = new Zbor(plecare, destinatie, this);
        return zbor;
    }
}
