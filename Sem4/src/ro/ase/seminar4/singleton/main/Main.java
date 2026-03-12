package ro.ase.seminar4.singleton.main;

import ro.ase.seminar4.singleton.clase.Logger;

public class Main {
    public void main(String[] args) {
//        pt Singleton la lucrare trb de 2 ori afisata instanta pt a se vedea ca e aceeasi
        Logger instanta = Logger.getInstance("Interfata", "afisare");
        instanta.afiseazaLog("Fisierul json nu e afisat corect");

        Logger instanta2 = Logger.getInstance("Backend", "afisare");

        instanta2.setSender("Backend");
        instanta2.afiseazaLog("Backend e aici");
    }
}
