package test1.SimpleFactory.clase;

public abstract class AMasina {
    protected String nrInmatriculare;
    protected String modelMasina;

    public AMasina(String nrInmatriculare, String modelMasina) {
        this.nrInmatriculare = nrInmatriculare;
        this.modelMasina = modelMasina;
    }
}
