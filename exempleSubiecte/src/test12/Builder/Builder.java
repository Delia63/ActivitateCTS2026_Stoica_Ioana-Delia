package test12.Builder;

public class Builder implements IBuilder{
    private String numeMeniu;
    private boolean felPrincipal;
    private boolean desert;
    private boolean pachetBauturi;
    private boolean scaunCopil;
    private boolean decorMasa;

    public Builder(String numeMeniu) {
        this.numeMeniu = numeMeniu;
        this.felPrincipal = false;
        this.desert = false;
        this.pachetBauturi = false;
        this.scaunCopil = false;
        this.decorMasa = false;
    }

    public Builder setFelPrincipal(boolean felPrincipal) {
        this.felPrincipal = felPrincipal;
        return this;
    }

    public Builder setDesert(boolean desert) {
        this.desert = desert;
        return this;
    }

    public Builder setPachetBauturi(boolean pachetBauturi) {
        this.pachetBauturi = pachetBauturi;
        return this;
    }

    public Builder setScaunCopil(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
        return this;
    }

    public Builder setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
        return this;
    }

    @Override
    public MeniuEveniment build() {
        return new MeniuEveniment(this.numeMeniu, this.felPrincipal, this.desert, this.pachetBauturi, this.scaunCopil, this.decorMasa);

    }
}
