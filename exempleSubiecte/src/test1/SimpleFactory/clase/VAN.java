package test1.SimpleFactory.clase;

public class VAN extends AMasina{

    public VAN(String nrInmatriculare, String modelMasina) {
        super(nrInmatriculare, modelMasina);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VAN{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", modelMasina='").append(modelMasina).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
