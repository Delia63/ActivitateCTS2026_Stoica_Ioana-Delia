package Creationale.Builder.ex1.clase;

public class Cont {
    private String numeTitular;
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public Cont(String numeTitular, boolean contSalariu, boolean cardAtasat, boolean internetBanking) {
        this.numeTitular = numeTitular;
        this.contSalariu = contSalariu;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numeTitular='").append(numeTitular).append('\'');
        sb.append(", contSalariu=").append(contSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
