package test11.SimpleFactory.clase;

public class SUV extends AMasina{
    public SUV(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
