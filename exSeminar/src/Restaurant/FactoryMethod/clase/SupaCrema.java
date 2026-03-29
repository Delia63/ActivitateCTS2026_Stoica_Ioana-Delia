package Restaurant.FactoryMethod.clase;

public class SupaCrema extends Supa {

    public SupaCrema(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Aceasta este supa are un gramaj de "+this.gramaj+" si un pret de "+this.pret);
    }
}
