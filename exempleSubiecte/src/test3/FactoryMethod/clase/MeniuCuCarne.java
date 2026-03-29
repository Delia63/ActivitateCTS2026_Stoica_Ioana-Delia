package test3.FactoryMethod.clase;

public class MeniuCuCarne implements IMeniu{
    @Override
    public void afisareIngrediente() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meniu cu carne: pulpe de pui, aripioare de pui, coaste de porc");
        System.out.println(sb.toString());
    }
}
