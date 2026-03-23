package Creationale.Singleton.ex3.clase;

public class DispeceratDepou {
    private String numeDepou;
    private int nrLocuri;

    private static DispeceratDepou instanta = null;

    public DispeceratDepou(String numeDepou, int nrLocuri) {
        this.numeDepou = numeDepou;
        this.nrLocuri = nrLocuri;
    }

    public String getNumeDepou() {
        return numeDepou;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public static synchronized DispeceratDepou getInstance(String nume, int nr) {
        if(instanta == null) {
            instanta = new DispeceratDepou(nume, nr);
        }

        return instanta;
    }
}
