package test10.SimpleFactory.clase;

public class Cafea implements IBautura{
    private String nume;
    private Double volum;
    private Double pret;

    public Cafea(String nume, Double volum, Double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public Cafea(Cafea c) {
        this.nume = c.nume;
        this.volum = c.volum;
        this.pret = c.pret;
    }

    @Override
    public void modPreparare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cafeaua ").append(this.nume).append(" se prepara prin adaugarea de lapte, zahar si cafea.");
        System.out.println(sb.toString());
    }

    @Override
    public IBautura copiaza() {
        return new Cafea(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
