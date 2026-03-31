package test8.SimpleFactory.clase;

public class Ceai implements IBautura{
    private String nume;
    private double mililitri;
    private double pret;

    public Ceai(String nume, double mililitri, double pret) {
        this.nume = nume;
        this.mililitri = mililitri;
        this.pret = pret;
    }

    @Override
    public void preparare() {
        System.out.println("Se prepara ceaiul.");
    }

    @Override
    public String getDetalii() {
        return "Ceai: Nume - "+this.nume+
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
}
