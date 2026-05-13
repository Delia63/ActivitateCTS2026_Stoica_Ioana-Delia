package Restaurant.Composite.clase;

public class Item implements Structura{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere(String spatii) {
        System.out.println(spatii + "Item: " + this.nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
