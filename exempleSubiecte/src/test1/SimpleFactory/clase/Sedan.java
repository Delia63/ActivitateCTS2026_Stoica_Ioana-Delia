package test1.SimpleFactory.clase;

public class Sedan extends AMasina{

    public Sedan(String nrInmatriculare, String modelMasina) {
        super(nrInmatriculare, modelMasina);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sedan{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", modelMasina='").append(modelMasina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
