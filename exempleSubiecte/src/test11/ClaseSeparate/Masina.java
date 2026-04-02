package test11.ClaseSeparate;

import test11.SimpleFactory.clase.AMasina;

public class Masina extends AMasina {
    public Masina(String nrInmatriculare, String model) {
        super(nrInmatriculare, model);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        return sb.toString();
    }
}
