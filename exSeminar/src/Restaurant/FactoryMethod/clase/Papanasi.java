package Restaurant.FactoryMethod.clase;

public class Papanasi extends Desert{
    public Papanasi(float gramaj, float calorii, float pret) {
        super(gramaj, calorii, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Acesti papanasi au un gramaj de "+this.gramaj+", calorii de "+this.calorii+" si un pret de "+this.pret);
    }
}
