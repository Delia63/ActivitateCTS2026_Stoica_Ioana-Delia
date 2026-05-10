package Structurale.Adapter.AdapterClase.inchiriereMasini;

public class Masina {
    private String model;
    private String culoare;

    public Masina(String model, String culoare) {
        this.model = model;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
