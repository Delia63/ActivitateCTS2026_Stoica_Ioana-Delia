package test3.FactoryMethod.clase;

public class MeniuVegetarian implements IMeniu{
    @Override
    public void afisareIngrediente() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meniu vegetarian: morcov, castravete, rosie");
        System.out.println(sb.toString());
    }
}
