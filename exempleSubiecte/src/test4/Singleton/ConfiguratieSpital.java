package test4.Singleton;

public class ConfiguratieSpital {
    private String adresaBD;
    private int versiunAplicatie;

    private static ConfiguratieSpital instanta = null;

    private ConfiguratieSpital(String adresaBD, int versiunAplicatie) {
        this.adresaBD = adresaBD;
        this.versiunAplicatie = versiunAplicatie;
    }

    public static synchronized ConfiguratieSpital getInstanta(String adresaBD, int versiunAplicatie) {
        if(instanta == null) instanta = new ConfiguratieSpital(adresaBD, versiunAplicatie);

        return instanta;
    }

    public void afisareStatus() {
        System.out.println("Aplicatia cu versiunea "
                +this.versiunAplicatie+
                " este conectata la BD de la adresa "
                +this.adresaBD);
    }
}
