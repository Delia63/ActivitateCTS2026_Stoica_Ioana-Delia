package Structurale.Facade.agentie.clase;

public class Zbor {
    private String orasPlecare;
    private String orasDestinatie;
    private CompanieAeriana companieAeriana;

    public Zbor(String orasPlecare, String orasDestinatie, CompanieAeriana companieAeriana) {
        this.orasPlecare = orasPlecare;
        this.orasDestinatie = orasDestinatie;
        this.companieAeriana = companieAeriana;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Zbor{");
        sb.append("orasPlecare='").append(orasPlecare).append('\'');
        sb.append(", orasDestinatie='").append(orasDestinatie).append('\'');
        sb.append(", companieAeriana=").append(companieAeriana);
        sb.append('}');
        return sb.toString();
    }
}
