package test10.SimpleFactory.clase;

public class CiocolataCalda implements IBautura{
    private String nume;
    private Double volum;
    private Double pret;

    public CiocolataCalda(String nume, Double volum, Double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    public CiocolataCalda(CiocolataCalda c) {
        this.nume = c.nume;
        this.volum = c.volum;
        this.pret = c.pret;
    }

    @Override
    public void modPreparare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ciocolata calda ").append(this.nume).append(" se prepara prin adaugarea a 3 lingurite de cacao in lapte.");
        System.out.println(sb.toString());
    }

    @Override
    public IBautura copiaza() {
        return new CiocolataCalda(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ciocolata calda{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
