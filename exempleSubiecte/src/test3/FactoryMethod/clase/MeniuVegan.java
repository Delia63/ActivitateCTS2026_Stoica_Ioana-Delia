package test3.FactoryMethod.clase;

import java.util.List;

public class MeniuVegan implements IMeniu{

    @Override
    public void afisareIngrediente() {
        StringBuilder sb = new StringBuilder();
        sb.append("Meniu vegan: salata, quinoa, avocado");
        System.out.println(sb.toString());

    }
}
