package Restaurant.FactoryMethod.clase;

public abstract class Supa implements FelMancare{
    protected float gramaj;
    protected float pret;

    public Supa(float gramaj, float pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }
}
