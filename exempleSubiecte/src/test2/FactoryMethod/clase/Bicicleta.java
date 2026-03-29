package test2.FactoryMethod.clase;

public class Bicicleta implements Vehicul{
    private int id;
    private String culoare;

    public Bicicleta(int id, String culoare) {
        this.id = id;
        this.culoare = culoare;
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bicicleta: ID - ").append(this.id)
                .append(", Culoare - ").append(this.culoare);
        System.out.println(sb.toString());
    }
}
