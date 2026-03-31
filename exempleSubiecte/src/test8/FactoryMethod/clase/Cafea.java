package test8.FactoryMethod.clase;

import test8.SimpleFactory.clase.IBautura;

public class Cafea implements IBauturaMethod {
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
}
