package test6.FactoryMethod.clase;

public class Tableta implements Produs{
    private String marca;

    public Tableta(String marca) {
        this.marca = marca;
    }

    @Override
    public void afisareSpecificatii() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tableta - ").append(this.marca);
        System.out.println(sb.toString());
    }
}
