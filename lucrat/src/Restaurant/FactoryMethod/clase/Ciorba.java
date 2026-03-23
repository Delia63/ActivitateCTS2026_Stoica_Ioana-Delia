package Restaurant.FactoryMethod.clase;

public class Ciorba extends Supa{
    public Ciorba(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Aceasta este ciorba are un gramaj de "+this.gramaj+" si un pret de "+this.pret);
    }
}
