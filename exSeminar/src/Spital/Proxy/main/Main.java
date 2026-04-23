package Spital.Proxy.main;

import Spital.Proxy.ProxySpital.ProxyAsigurare;
import Spital.Proxy.clase.ISpital;
import Spital.Proxy.clase.Pacient;
import Spital.Proxy.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu", true);
        Spital spital = new Spital("Judetean");
        spital.interneazaPacient(pacient1);

        Pacient pacient2 = new Pacient("Ionescu", true);
        Pacient pacient3 = new Pacient("Mircea", false);
        ISpital proxyAsigurare = new ProxyAsigurare(spital);
        proxyAsigurare.interneazaPacient(pacient2);
        proxyAsigurare.interneazaPacient(pacient3);


    }
}
