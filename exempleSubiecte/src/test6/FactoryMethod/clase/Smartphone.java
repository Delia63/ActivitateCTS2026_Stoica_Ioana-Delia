package test6.FactoryMethod.clase;

public class Smartphone implements Produs{
    private String marca;

    public Smartphone(String marca) {
        this.marca = marca;
    }

    @Override
    public void afisareSpecificatii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Smartphone - ").append(this.marca);
        System.out.println(sb.toString());
    }
}
