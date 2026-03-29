package STB.Prototype.main;

import STB.Prototype.clase.Autobuz;
import STB.Prototype.clase.IAutobuz;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<String> listaSetari = new ArrayList<String>();
        listaSetari.add("WIFI");
        listaSetari.add("Sistem audio");

        IAutobuz autobuz1 = new Autobuz("MAN", listaSetari);
        System.out.println(autobuz1);

        IAutobuz autobuz2 = autobuz1.copiaza();
        autobuz2.getListaSetari().add("AC");
        System.out.println(autobuz2);

    }
}
