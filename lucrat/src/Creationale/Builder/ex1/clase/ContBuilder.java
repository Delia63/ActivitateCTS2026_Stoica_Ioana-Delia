package Creationale.Builder.ex1.clase;

public class ContBuilder implements InterfaceContBuilder{
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBuilder() {
        this.contSalariu = false;
        this.cardAtasat = false;
        this.internetBanking = false;
    }

    public ContBuilder setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;
    }

    public ContBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    @Override
    public Cont build(String numeTitular) {
        return new Cont(numeTitular, this.contSalariu, this.cardAtasat, this.internetBanking);

    }
}
