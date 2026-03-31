package test6.FactoryMethod.clase;

public class Laptop implements Produs{
    private String marca;

    public Laptop(String marca) {
        this.marca = marca;
    }

    @Override
    public void afisareSpecificatii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop - ").append(this.marca);
        System.out.println(sb.toString());
    }
}
