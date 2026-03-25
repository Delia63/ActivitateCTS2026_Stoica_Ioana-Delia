package Creationale.FactoryMethod.ex1.clase;

public abstract class Medicament {
    protected String denumire;
    protected float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void descriere();
}
