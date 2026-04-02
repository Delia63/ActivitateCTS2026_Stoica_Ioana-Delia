package test11.SimpleFactory.clase;

public class VAN extends AMasina{
    public VAN(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
