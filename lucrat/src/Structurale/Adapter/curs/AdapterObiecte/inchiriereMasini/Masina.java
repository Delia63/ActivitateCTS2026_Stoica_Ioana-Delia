package Structurale.Adapter.curs.AdapterObiecte.inchiriereMasini;

public class Masina {
    private String model;
    private String nrInmatriculare;

    public Masina(String model, String nrInmatriculare) {
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
