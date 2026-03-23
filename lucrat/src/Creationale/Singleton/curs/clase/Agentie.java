package Creationale.Singleton.curs.clase;

public class Agentie {
    private String numeAgentie;
    private float capital;
    private int nrAngajati;

    private static Agentie instanta = null;

    private Agentie(String numeAgentie, float capital, int nrAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.nrAngajati = nrAngajati;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static synchronized Agentie getInstance(String nume, float capital, int nrAngajati) {
        if(instanta == null)
            instanta = new Agentie(nume, capital, nrAngajati);
        return instanta;
    }
}
