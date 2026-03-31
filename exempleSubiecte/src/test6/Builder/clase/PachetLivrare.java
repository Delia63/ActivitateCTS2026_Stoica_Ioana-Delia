package test6.Builder.clase;

public class PachetLivrare {
    private boolean impachetareCadou;
    private boolean livrareUrgenta;
    private String mesajPersonalizat;
    private boolean asigurareContinut;

    public PachetLivrare(boolean impachetareCadou, boolean livrareUrgenta, String mesajPersonalizat, boolean asigurareContinut) {
        this.impachetareCadou = impachetareCadou;
        this.livrareUrgenta = livrareUrgenta;
        this.mesajPersonalizat = mesajPersonalizat;
        this.asigurareContinut = asigurareContinut;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetLivrare{");
        sb.append("impachetareCadou=").append(impachetareCadou);
        sb.append(", livrareUrgenta=").append(livrareUrgenta);
        sb.append(", mesajPersonalizat='").append(mesajPersonalizat).append('\'');
        sb.append(", asigurareContinut=").append(asigurareContinut);
        sb.append('}');
        return sb.toString();
    }
}
