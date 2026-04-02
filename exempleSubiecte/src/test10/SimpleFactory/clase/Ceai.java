package test10.SimpleFactory.clase;

public class Ceai implements IBautura{
    private String nume;
    private Double volum;
    private Double pret;

    public Ceai(String nume, Double volum, Double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public Ceai(Ceai c) {
        this.nume = c.nume;
        this.volum = c.volum;
        this.pret = c.pret;
    }

    @Override
    public void modPreparare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ceaiul ").append(this.nume).append(" se prepara prin adaugarea unui plic in apa timp de 10 min.");
        System.out.println(sb.toString());
    }

    @Override
    public IBautura copiaza() {
        return new Ceai(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ceai{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
