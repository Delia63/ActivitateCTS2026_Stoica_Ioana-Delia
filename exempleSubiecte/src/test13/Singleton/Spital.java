package test13.Singleton;

public class Spital {
    private String numeSpital;
    private String adresaSpital;
    private String numeManager;

    private static Spital instanta = null;

    private Spital(String numeSpital, String adresaSpital, String numeManager) {
        this.numeSpital = numeSpital;
        this.adresaSpital = adresaSpital;
        this.numeManager = numeManager;
    }

    public static synchronized Spital getInstanta(String numeSpital, String adresaSpital, String numeManager) {
        if(instanta == null) instanta = new Spital(numeSpital, adresaSpital, numeManager);
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Spital{");
        sb.append("numeSpital='").append(numeSpital).append('\'');
        sb.append(", adresaSpital='").append(adresaSpital).append('\'');
        sb.append(", numeManager='").append(numeManager).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
