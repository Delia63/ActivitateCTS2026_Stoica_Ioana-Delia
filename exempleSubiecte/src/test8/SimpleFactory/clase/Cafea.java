package test8.SimpleFactory.clase;

public class Cafea implements IBautura{
    private String nume;
    private double mililitri;
    private double pret;

    public Cafea(String nume, double mililitri, double pret) {
        this.nume = nume;
        this.mililitri = mililitri;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara cafeaua.");
    }

    @Override
    public String getDetalii() {
        return "Cafea: Nume - "+this.nume+
                " Cantitate - "+this.mililitri+
                " Pret - "+this.pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public boolean adaugaTopping() {
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cafea{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", mililitri=").append(mililitri);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
