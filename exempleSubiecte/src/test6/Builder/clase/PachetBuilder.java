package test6.Builder.clase;

public class PachetBuilder implements IPachetBuilder{
    private boolean impachetareCadou;
    private boolean livrareUrgenta;
    private String mesajPersonalizat;
    private boolean asigurareContinut;

    public PachetBuilder() {
        this.impachetareCadou = false;
        this.livrareUrgenta = false;
        this.mesajPersonalizat = null;
        this.asigurareContinut = false;
    }

    public PachetBuilder setImpachetareCadou(boolean impachetareCadou) {
        this.impachetareCadou = impachetareCadou;
        return this;
    }

    public PachetBuilder setLivrareUrgenta(boolean livrareUrgenta) {
        this.livrareUrgenta = livrareUrgenta;
        return this;
    }

    public PachetBuilder setMesajPersonalizat(String mesajPersonalizat) {
        this.mesajPersonalizat = mesajPersonalizat;
        return this;
    }

    public PachetBuilder setAsigurareContinut(boolean asigurareContinut) {
        this.asigurareContinut = asigurareContinut;
        return this;
    }

    @Override
    public PachetLivrare build() {
        return new PachetLivrare(this.impachetareCadou, this.livrareUrgenta, this.mesajPersonalizat, this.asigurareContinut);
    }
}
