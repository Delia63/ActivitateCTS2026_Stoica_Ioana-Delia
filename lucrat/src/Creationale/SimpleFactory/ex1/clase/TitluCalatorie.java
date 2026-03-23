package Creationale.SimpleFactory.ex1.clase;

public abstract class TitluCalatorie {
    private float pret;

    public TitluCalatorie(float pret) {
        this.pret = pret;
    }

    public abstract void descriere();
}
