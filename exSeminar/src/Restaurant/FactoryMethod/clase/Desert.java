package Restaurant.FactoryMethod.clase;

public abstract class Desert implements FelMancare{
    protected float gramaj;
    protected float pret;
    protected float calorii;

    public Desert(float gramaj, float pret, float calorii) {
        this.gramaj = gramaj;
        this.pret = pret;
        this.calorii = calorii;
    }
}
