package test12.Builder;

public class MeniuEveniment {
    private String numeMeniu;
    private boolean felPrincipal;
    private boolean desert;
    private boolean pachetBauturi;
    private boolean scaunCopil;
    private boolean decorMasa;

    public MeniuEveniment(String numeMeniu, boolean felPrincipal, boolean desert, boolean pachetBauturi, boolean scaunCopil, boolean decorMasa) {
        this.numeMeniu = numeMeniu;
        this.felPrincipal = felPrincipal;
        this.desert = desert;
        this.pachetBauturi = pachetBauturi;
        this.scaunCopil = scaunCopil;
        this.decorMasa = decorMasa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MeniuEveniment{");
        sb.append("numeMeniu='").append(numeMeniu).append('\'');
        sb.append(", felPrincipal=").append(felPrincipal);
        sb.append(", desert=").append(desert);
        sb.append(", pachetBauturi=").append(pachetBauturi);
        sb.append(", scaunCopil=").append(scaunCopil);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append('}');
        return sb.toString();
    }
}
