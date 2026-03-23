package Restaurant.FactoryMethod.clase;

public class Clatite extends Desert{
    public Clatite(float gramaj, float calorii, float pret) {
        super(gramaj, calorii, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Aceste clatite au un gramaj de "+this.gramaj+", calorii de "+this.calorii+" si un pret de "+this.pret);
    }
}
